
"use client"
import { useState, useEffect } from "react"
import './perfil.scss'


export default function Perfil() {
    const [usuarioAutenticado, setUsuarioAutenticado] = useState(null);
    const [editandoPerfil, setEditandoPerfil] = useState(false);
    const [novoPerfil, setNovoPerfil] = useState({});

    useEffect(() => {
        const usuarioSalvo = sessionStorage.getItem('usuarioAutenticado');

        if (usuarioSalvo) {
            setUsuarioAutenticado(JSON.parse(usuarioSalvo));
            setNovoPerfil(JSON.parse(usuarioSalvo));
        } else {
            window.location.href = "/login";
        }
    }, []);

    const handleEditar = () => {
        setEditandoPerfil(true);
    }

    const handleCancelar = () => {
        setEditandoPerfil(false);
        setNovoPerfil(usuarioAutenticado);
    }

    const handleSalvar = (e) => {
        e.preventDefault();

        fetch(`http://localhost:8080/WebApi/rest/usuario/${usuarioAutenticado.id}`, {
            method: "put",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(novoPerfil),
        })
            .then(() => {
                console.log('Perfil atualizado com sucesso');
                const novoUsuario = {
                    ...usuarioAutenticado,
                    ...novoPerfil
                };
                setUsuarioAutenticado(novoUsuario);
                sessionStorage.setItem('usuarioAutenticado', JSON.stringify(novoUsuario));
                window.location.href = "/perfil";
            })
            .catch(error => {
                console.error('Erro ao atualizar perfil', error);
            });
    }

    const deslogar = () => {
        sessionStorage.removeItem("usuarioAutenticado");
        setUsuarioAutenticado("");
        window.location.href = "/login";
    }

    const handleChange = (e) => {
        const { name, value } = e.target;
        setNovoPerfil(prevState => ({
            ...prevState,
            [name]: value
        }));
    }

    if (!usuarioAutenticado) {
        return <div><h3>Carregando...</h3></div>;
    }


    return (
        <main>
            <div className="content_perfil">

                <h3>{usuarioAutenticado.nome}</h3>
                {editandoPerfil ? (
                    <>
                        <label>Email: </label>
                        <input type="text" name="enail" value={novoPerfil.email} onChange={handleChange} />
                        <br />
                        <label>CPF: </label>
                        <input type="text" name="cpf" value={novoPerfil.cpf} onChange={handleChange} />
                        <br />
                        <label>Telefone: </label>
                        <input type="text" name="telefone" value={novoPerfil.telefone} onChange={handleChange} />
                        <br />
                        <label>Senha: </label>
                        <input type="password" name="senha" value={novoPerfil.senha} onChange={handleChange} />
                        <br />
                        <label>Amigos: </label>
                        <input type="text" name="contatos" value={novoPerfil.contatos} onChange={handleChange} />
                        <br />
                        <label>Vacinado: </label>
                        <select name="vacinado" value={novoPerfil.vacinado} onChange={handleChange}>
                            <option value="">Escolha uma opção</option>
                            <option value="Sim">Sim</option>
                            <option value="Nao">Não</option>
                        </select>
                        <br />
                        <label>Plano de Saúde: </label>
                        <input type="text" name="planoSaude" value={novoPerfil.planoSaude} onChange={handleChange} />
                        <br />
                        <label>Estado de Saúde(doente): </label>
                        <select name="saudeStatus" value={novoPerfil.saudeStatus} onChange={handleChange}>
                            <option value="">Escolha uma opção</option>
                            <option value="Sim">Sim</option>
                            <option value="Nao">Não</option>
                        </select>
                        <br />
                    </>
                ) : (
                    <>
                        <p>Email: <span>{usuarioAutenticado.email}</span></p>
                        <p>CPF: <span>{usuarioAutenticado.cpf}</span></p>
                        <p>Telefone: <span>{usuarioAutenticado.telefone}</span></p>
                        <p>Senha: <span>*******</span></p>
                        <p>Amigos: <span>{usuarioAutenticado.contatos}</span></p>
                        <p>Vacinado: <span>{usuarioAutenticado.vacinado}</span></p>
                        <p>Plano de Saúde: <span>{usuarioAutenticado.planoSaude}</span></p>
                        <p>Estado de Saúde(doente): <span>{usuarioAutenticado.saudeStatus}</span></p>

                        {usuarioAutenticado.saudeStatus === "Sim" && (
                        <p>{usuarioAutenticado.nome} é fortemente recomendado que você tome todos os cuidados indicados na página "Cuide-se". Todos os seus amigos foram notificados sobre o seu estado.</p>
                    )}
                    </>
                )}
                <button onClick={editandoPerfil ? handleSalvar : handleEditar}>
                    {editandoPerfil ? 'Salvar' : 'Editar'}
                </button>
                {editandoPerfil && <button onClick={handleCancelar}>Cancelar</button>}
                <button className="button2" onClick={deslogar}>Deslogar</button>

            </div>

        </main>
    )
}

