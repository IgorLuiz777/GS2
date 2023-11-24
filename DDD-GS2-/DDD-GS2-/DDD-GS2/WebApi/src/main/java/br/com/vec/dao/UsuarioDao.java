package br.com.vec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vec.entity.Usuario;

public class UsuarioDao {
	
	private Connection conexao;
	
	public void inserir(Usuario usuario) throws SQLException {
			conexao = GerenciadorBd.obterConexao();
			PreparedStatement comandoSql = null;
			String sql = "insert into t_vec_usuario (ID_USUARIO, NM_USUARIO," +
					"NM_EMAIL, NR_CPF, NR_TELEFONE, NR_SENHA, ST_VACINA,"
					+ "ST_SAUDE, NM_PLANO_SAUDE, NM_CONTATOS) values(?,?,?,?,?,?,?,?,?,?)";
			comandoSql = conexao.prepareStatement(sql);
			comandoSql.setInt(1, usuario.getId());
			comandoSql.setString(2, usuario.getNome());
			comandoSql.setString(3, usuario.getEmail());
			comandoSql.setString(4, usuario.getCpf());
			comandoSql.setString(5, usuario.getTelefone());
			comandoSql.setString(6, usuario.getSenha());
			comandoSql.setString(7, usuario.getVacinado());
			comandoSql.setString(8, usuario.getSaudeStatus());
			comandoSql.setString(9, usuario.getPlanoSaude());
			comandoSql.setString(10, usuario.getContatos());
			comandoSql.executeUpdate();
			conexao.close();
			comandoSql.close();
	}
	
	public void alterar(Usuario usuario) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "update t_vec_usuario set nm_usuario = ?, nm_email = ?, nr_cpf = ?,"
				+ "nr_telefone = ?, nr_senha = ?, st_vacina = ?, st_saude = ?,"
				+ "nm_plano_saude = ?, nm_contatos = ?"
				+ "where id_usuario = ?";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setString(1, usuario.getNome());
		comandoSql.setString(2, usuario.getEmail());
		comandoSql.setString(3, usuario.getCpf());
		comandoSql.setString(4, usuario.getTelefone());
		comandoSql.setString(5, usuario.getSenha());
		comandoSql.setString(6, usuario.getVacinado());
		comandoSql.setString(7, usuario.getSaudeStatus());
		comandoSql.setString(8, usuario.getPlanoSaude());
		comandoSql.setString(9, usuario.getContatos());
		comandoSql.setInt(10, usuario.getId());
		comandoSql.executeUpdate();
		conexao.close();
		comandoSql.close();
	}
	
	public void excluir(int id) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "delete from t_vec_usuario where id_usuario = ?";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setInt(1, id);
		comandoSql.executeUpdate();
		conexao.close();
		comandoSql.close();
	}
	
	public List<Usuario> buscarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		
		try {
			String sql = "Select * from t_vec_usuario";
			comandoSql = conexao.prepareStatement(sql);
			ResultSet rs = comandoSql.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setEmail(rs.getString(3));
				usuario.setCpf(rs.getString(4));
				usuario.setTelefone(rs.getString(5));
				usuario.setSenha(rs.getString(6));
				usuario.setVacinado(rs.getString(7));
				usuario.setSaudeStatus(rs.getString(8));
				usuario.setPlanoSaude(rs.getString(9));
				usuario.setContatos(rs.getString(10));
				usuarios.add(usuario); 
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	
	public Usuario buscarUsuariosPorId(int id) {
		Usuario usuario = new Usuario();
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		try {
			String sql = "Select * from t_vec_usuario where id_usuario = ?";
			comandoSql = conexao.prepareStatement(sql);
			comandoSql.setInt(1, id);
			ResultSet rs = comandoSql.executeQuery();
			if(rs.next()) {
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setEmail(rs.getString(3));
				usuario.setCpf(rs.getString(4));
				usuario.setTelefone(rs.getString(5));
				usuario.setSenha(rs.getString(6));
				usuario.setVacinado(rs.getString(7));
				usuario.setSaudeStatus(rs.getString(8));
				usuario.setPlanoSaude(rs.getString(9));
				usuario.setContatos(rs.getString(10));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	
	
	
	

}
