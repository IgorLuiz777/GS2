
"use client"
import { useState, useEffect } from "react";
import Link from "next/link";
import "./login.scss";
import Button from "@/components/button";

export default function Login() {
    const [usuario, setUsuario] = useState([]);
    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");

    useEffect(() => {
        fetch("http://localhost:5000/usuario")
            .then((resposta) => resposta.json())
            .then((resposta) => setUsuario(resposta))
            .catch((error) => console.log(error));
    }, []);

    const handleLogin = () => {
        const usuarioAutenticado = usuario.find(
            (user) => user.email === email && user.senha === senha
        );
    
        if (usuarioAutenticado) {
            sessionStorage.setItem('usuarioAutenticado', JSON.stringify(usuarioAutenticado));
            
            window.location.href = "/perfil";
        } else {
            console.log("Credenciais inválidas");
        }
    };

    return (
        <main>
            <div className="content_login">
                <div className="div_img">
                    <img src="cadastro(1).png" alt="" />
                </div>
                <div className="form">
                    <h3>Login</h3>
                    <form action="">
                        <label htmlFor="email">Email</label>
                        <input
                            type="email"
                            name="email"
                            id="email"
                            placeholder="Digite o seu email"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}
                            required
                        />

                        <label htmlFor="password">Senha</label>
                        <input
                            type="password"
                            name="password"
                            id="password"
                            placeholder="Digite a sua senha"
                            value={senha}
                            onChange={(e) => setSenha(e.target.value)}
                            required
                        />

                        <button type="button" onClick={handleLogin}>Entrar</button>

                        <Button type="button" nome="Entrar" onClick={handleLogin} />

                        <p>Não tem um cadastro?<Link href={"/cadastro"}> Cadastre-se</Link></p>
                    </form>
                </div>
            </div>
        </main>
    );
}
