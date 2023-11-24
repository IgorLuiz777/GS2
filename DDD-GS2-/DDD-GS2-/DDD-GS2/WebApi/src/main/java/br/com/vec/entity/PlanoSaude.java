package br.com.vec.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PlanoSaude {
	
	private int id;
	private String nome;
	private String cobertura;
	
	
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
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	

}
