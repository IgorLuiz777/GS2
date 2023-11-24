package br.com.vec.bo;

import java.sql.SQLException;

import br.com.vec.dao.ContatosDao;
import br.com.vec.entity.Contatos;

public class ContatosBo {
	
	private ContatosDao contatosDao;
	
	public void cadastrar(Contatos contatos) throws SQLException {
		contatosDao = new ContatosDao();
		contatosDao.cadastrar(contatos);
	}
	
	public Contatos buscarPorId(int id) throws SQLException {
		contatosDao = new ContatosDao();
		return contatosDao.buscarPorId(id);
	}
	
	public void excluir(int id) throws SQLException {
		contatosDao = new ContatosDao();
		contatosDao.excluir(id);
	}
}
