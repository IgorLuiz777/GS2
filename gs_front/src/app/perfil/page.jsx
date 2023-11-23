
"use client"
import { useState, useEffect } from "react"

export default function Perfil() {

    const [usuarioAutenticado, setUsuarioAutenticado] = useState(null);

    useEffect(() => {
        const usuarioSalvo = sessionStorage.getItem('usuarioAutenticado');

        if (usuarioSalvo) {
            setUsuarioAutenticado(JSON.parse(usuarioSalvo));
        } else {
            window.location.href = "/login";
        }
    }, []);
    const deslogar = ()=> {
        sessionStorage.removeItem("usuarioAutenticado")
        setUsuarioAutenticado("")
      }

    if (!usuarioAutenticado) {
        return <div><h3>Carregando...</h3></div>;
    }

    return (
        <main>
            <div className="content_perfil">

                <div>
                    <h3>{usuarioAutenticado.nome}</h3>
                    <p>Email: {usuarioAutenticado.email}</p>
                    <p>CPF: {usuarioAutenticado.cpf}</p>
                    <p>Telefone celular{usuarioAutenticado.telefone}</p>
                    <p>Senha: {usuarioAutenticado.senha}</p>
                    <button onClick={deslogar}>Deslogar</button>
                </div>
            </div>
        </main>
    )
}
