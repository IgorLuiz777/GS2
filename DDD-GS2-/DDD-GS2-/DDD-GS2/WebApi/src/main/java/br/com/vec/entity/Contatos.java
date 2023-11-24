package br.com.vec.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contatos {
	
	private int id;
	private String nome;
	private Saude statusSaude;
	private String historicoDoencas;
	private int numeroAmigos;
	
	
	
	public int getNumeroAmigos() {
		return numeroAmigos;
	}
	public void setNumeroAmigos(int numeroAmigos) {
		this.numeroAmigos = numeroAmigos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Saude getStatusSaude() {
		return statusSaude;
	}
	public void setStatusSaude(Saude statusSaude) {
		this.statusSaude = statusSaude;
	}
	public String getHistoricoDoencas() {
		return historicoDoencas;
	}
	public void setHistoricoDoencas(String historicoDoencas) {
		this.historicoDoencas = historicoDoencas;
	}
	
	

}
