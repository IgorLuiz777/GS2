package br.com.vec.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Localizacao {
	
	private Endereco endereco;
	private String tipoLocal;
	private Date horarioExato;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTipoLocal() {
		return tipoLocal;
	}
	public void setTipoLocal(String tipoLocal) {
		this.tipoLocal = tipoLocal;
	}
	public Date getHorarioExato() {
		return horarioExato;
	}
	public void setHorarioExato(Date horarioExato) {
		this.horarioExato = horarioExato;
	}
	
	

}
