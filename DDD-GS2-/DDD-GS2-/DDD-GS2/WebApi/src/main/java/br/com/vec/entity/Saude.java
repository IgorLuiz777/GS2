package br.com.vec.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Saude {
	
	private String status;
	private Doenca doenca;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Doenca getDoenca() {
		return doenca;
	}
	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}
	
	

}
