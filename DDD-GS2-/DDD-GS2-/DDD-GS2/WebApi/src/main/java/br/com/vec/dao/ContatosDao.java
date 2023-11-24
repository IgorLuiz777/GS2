package br.com.vec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vec.entity.Contatos;

public class ContatosDao {
	private Connection conexao;
	ContatosDao contatosDao = new ContatosDao();
	
	public void cadastrar(Contatos contatos) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "insert into t_vec_amigos_usuario (id_amigos_usuario," +
		"nm_amigos, nr_amigos) values (?,?,?)";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setInt(1, contatos.getId());
		comandoSql.setString(2, contatos.getNome());
		comandoSql.setInt(3, contatos.getNumeroAmigos());
				
		
	}
	
	public Contatos buscarPorId(int id) throws SQLException {
		Contatos contatos = new Contatos();
		PreparedStatement comandoSql = null;
		conexao = GerenciadorBd.obterConexao();
		try {
		String sql = "Select nm_amigos, nr_amigos from t_vec_amigos_usuario where id_amigos_usuario = ?";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setInt(1, id);
		ResultSet rs = comandoSql.executeQuery();
		if(rs.next()) {
			contatos.setId(rs.getInt(1));
			contatos.setNome(rs.getString(2));
			contatos.setNumeroAmigos(rs.getInt(3));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return contatos;
	}
	
	public List<Contatos> buscarAmigos() throws SQLException {
		
		//buscar os seus contatos
		//select id_contato from contato_perfil where id_usuario = perfil.getUsuario.getId
		conexao = GerenciadorBd.obterConexao();
	    PreparedStatement comandoSql = null;
	    String sql = "select id_amigos_usuario from t_vec_amigos_perfil where id_perfil = perfil.getUsuario.getId";
		List<Integer> listaIds = new ArrayList<>(); //trazer do banco
		//buscou e preencheu essa lista
		List<Contatos> listaAmigo = new ArrayList<>();
		for (Integer id : listaIds) {
			Contatos c = new Contatos();
			c = contatosDao.buscarPorId(id);
			listaAmigo.add(c);
		}
		
		return listaAmigo;
		//retorna para o bo; no bo seta perfil.setCOntatos	
			
		}
	
	public void excluir(int id) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "delete from t_vec_amigos_usuario where id_amigos_usuario = ?";
		try {
			comandoSql = conexao.prepareStatement(sql);
			comandoSql.setInt(1, id);
			comandoSql.executeUpdate();
			conexao.close();
			comandoSql.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
