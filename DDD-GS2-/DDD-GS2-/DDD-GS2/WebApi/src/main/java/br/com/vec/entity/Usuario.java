package br.com.vec.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {
	
	private String nome;
	private String telefone;
	private String cpf;
	private Endereco endereco;
	private String senha;
	private int id;
	private String email;
	private String vacinado;
	private String saudeStatus;
	private String planoSaude;
	private String contatos;

	
	public String getVacinado() {
		return vacinado;
	}
	public void setVacinado(String vacinado) {
		this.vacinado = vacinado;
	}
	public String getSaudeStatus() {
		return saudeStatus;
	}
	public void setSaudeStatus(String saudeStatus) {
		this.saudeStatus = saudeStatus;
	}
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	public String getContatos() {
		return contatos;
	}
	public void setContatos(String contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
