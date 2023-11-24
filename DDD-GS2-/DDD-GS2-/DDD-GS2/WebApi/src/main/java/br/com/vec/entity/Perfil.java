package br.com.vec.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Perfil {
	
	private Usuario usuario;
	private Contatos contatos;
	private Vacinacao vacinacao;  //list
	private Saude statusSaude;
	private PlanoSaude planoSaude;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Contatos getContatos() {
		return contatos;
	}
	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}
	public Vacinacao getVacinacao() {
		return vacinacao;
	}
	public void setVacinacao(Vacinacao vacinacao) {
		this.vacinacao = vacinacao;
	}
	public Saude getStatusSaude() {
		return statusSaude;
	}
	public void setStatusSaude(Saude statusSaude) {
		this.statusSaude = statusSaude;
	}
	public PlanoSaude getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(PlanoSaude planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	

}
