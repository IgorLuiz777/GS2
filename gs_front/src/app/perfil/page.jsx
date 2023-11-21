
"use client"
import { useState, useEffect } from "react"

export default function Perfil() {

    const [usuarioAutenticado, setUsuarioAutenticado] = useState(null);

    useEffect(() => {
        // Obter detalhes do usuário do sessionStorage
        const usuarioSalvo = sessionStorage.getItem('usuarioAutenticado');

        if (usuarioSalvo) {
            setUsuarioAutenticado(JSON.parse(usuarioSalvo));
        } else {
            // Usuário não autenticado, redirecionar para a página de login
            window.location.href = "/login";
        }
    }, []);

    if (!usuarioAutenticado) {
        // Renderizar loading ou outra lógica enquanto os detalhes do usuário estão sendo carregados
        return <div>Carregando...</div>;
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
                </div>
            </div>
        </main>
    )
}
