"use client";
import { useEffect, useState } from "react";
import Link from "next/link";
import "./cadastro.scss";

export default function Cadastro() {

  const [novo, setNovo] = useState({
    nome: "",
    email: "",
    cpf: "",
    telefone: "",
    senha: "",
  });

  const handleChange = (e) => {
    setNovo({ ...novo, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    fetch("http://localhost:8080/WebApi/rest/usuario", {
      method: "post",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(novo),
    }).then(() => {
      window.location = "/login";
      console.log('Cliente criado com sucesso');
    }).catch(error => {
        console.error('Erro ao criar cliente', error);
    });
};

  return (
    <main>
      <div className="content_cadastro">
        <div className="div_img">
          <img src="cadastro(1).png" alt="" />
        </div>
        <div className="form">
          <h3>Cadastro</h3>
          <form onSubmit={handleSubmit}>
            <label htmlFor="nome">Nome</label>
            <input
              type="text"
              name="nome"
              placeholder="Digite o seu nome"
              value={novo.nome}
              onChange={handleChange}
              required
            />

            <label htmlFor="email">Email</label>
            <input
              type="email"
              name="email"
              placeholder="Digite o seu email"
              value={novo.email}
              onChange={handleChange}
              required
            />

            <label htmlFor="cpf">CPF (formato: 123.456.789-10)</label>
            <input
              type="text"
              name="cpf"
              placeholder="Digite o seu cpf"
              value={novo.cpf}
              onChange={handleChange}
              required
            />

            <label htmlFor="telefone">Celular</label>
            <input
              type="text"
              name="telefone"
              placeholder="Digite o seu número"
              value={novo.telefone}
              onChange={handleChange}
              required
            />

            <label htmlFor="senha">Senha</label>
            <input
              type="password"
              name="senha"
              placeholder="Digite a sua senha"
              value={novo.senha}
              onChange={handleChange}
              required
            />

            <button className="button" type="submit">Cadastrar</button>

            <p>
              Já tem um cadastro? <Link href={"/login"}>Login</Link>
            </p>
          </form>
        </div>
      </div>
    </main>
  );
}
