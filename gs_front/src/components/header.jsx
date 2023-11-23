
"use client"

import Link from "next/link";
import './components.scss'
import { useEffect, useState } from "react";

export default function header() {

    const [usuarioAutenticado, setUsuarioAutenticado] = useState(null);

    useEffect(() => {
        const usuarioSalvo = sessionStorage.getItem('usuarioAutenticado');

        if (usuarioSalvo) {
            setUsuarioAutenticado(JSON.parse(usuarioSalvo));
        }
    }, []);

    if (usuarioAutenticado) {
        return <div className="content_header">
            <header>
                <nav>
                    <ul>
                        <li><p>TechCare <span>4 All</span></p></li>
                        <div className="nav_links">
                            <li><Link href={'/'}>Home</Link></li>
                            <li><Link href={'/servicos'}>Serviços</Link></li>
                            <li><Link href={'/cuidar'}>Cuide-se</Link></li>
                            <li><Link href={'/perfil'}>Perfil</Link></li>
                            <li><Link href={'/contato'}>Contatate-nos</Link></li>
                        </div>
                        <li> <p className="nome_usuario">Olá {usuarioAutenticado.nome}</p></li>
                    </ul>
                </nav>
            </header>
        </div>
    }

    return (
        <div className="content_header">
            <header>
                <nav>
                    <ul>
                        <li><p>TechCare <span>4 All</span></p></li>
                        <div className="nav_links">
                            <li><Link href={'/'}>Home</Link></li>
                            <li><Link href={'/servicos'}>Serviços</Link></li>
                            <li><Link href={'/cuidar'}>Cuide-se</Link></li>
                            <li><Link href={'/perfil'}>Perfil</Link></li>
                            <li><Link href={'/contato'}>Contatate-nos</Link></li>
                        </div>
                        <li><Link href={'/login'} className={"login"}>Login</Link> <Link href={'/cadastro'} className={"cadastro"}>Cadastro</Link></li>
                    </ul>
                </nav>
            </header>
        </div>
    )
}