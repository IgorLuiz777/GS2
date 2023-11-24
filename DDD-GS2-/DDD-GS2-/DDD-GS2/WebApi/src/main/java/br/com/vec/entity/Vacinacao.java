package br.com.vec.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vacinacao {
	
	private int id;
	private String nome;
	private String tomouVacina;
	
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
	public String getTomouVacina() {
		return tomouVacina;
	}
	public void setTomouVacina(String tomouVacina) {
		this.tomouVacina = tomouVacina;
	}
	
	

}
