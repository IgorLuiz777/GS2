package br.com.vec.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.vec.dao.UsuarioDao;
import br.com.vec.entity.Usuario;

public class UsuarioBo {
	
	private UsuarioDao usuarioDao;
	
	public void cadastrar(Usuario usuario) throws SQLException {
		usuarioDao = new UsuarioDao();
		usuarioDao.inserir(usuario);
	}
	
	public void alterar(Usuario usuario) throws SQLException {
		usuarioDao = new UsuarioDao();
		usuarioDao.alterar(usuario);
	}
	
	public void excluir(int id) throws SQLException {
		usuarioDao = new UsuarioDao();
		usuarioDao.excluir(id);
	}
	
	public List<Usuario> buscarUsuarios(){
		usuarioDao = new UsuarioDao();
		return usuarioDao.buscarUsuarios();
	}
	
	public Usuario buscarUsuariosPorId(int id) {
		usuarioDao = new UsuarioDao();
		return usuarioDao.buscarUsuariosPorId(id);
	}
}
