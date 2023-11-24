package br.com.vec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vec.entity.Contatos;
import br.com.vec.entity.Perfil;
import br.com.vec.entity.Usuario;

public class PerfilDao {
	private Connection conexao;
	private Perfil perfil = new Perfil();
	ContatosDao contatosDao = new ContatosDao();
	
	
	public void buscarPerfil(String nome) throws SQLException {
		//select usuario where nome = nome
		//carregar do banco
		Contatos contatos = new Contatos();
		Usuario usuario = new Usuario();
		PreparedStatement comandoSql = null;
		conexao = GerenciadorBd.obterConexao();
		try {
			String sql = "Select nm_usuario from t_vec_cadastro where nm_usuario = nm_usuario";
			comandoSql = conexao.prepareStatement(sql);
			comandoSql.setString(1, nome);
			ResultSet rs = comandoSql.executeQuery();
			if(rs.next()) {
				usuario.setNome(rs.getString(1));
				perfil.setUsuario(usuario);
				//perfil.usuario.setNome(rs.getString(1));
			}
		
		//perfil.setUsuario(usuario);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void adicionarContato(Contatos contatos) throws SQLException {
		//1º passo - id contato e do id_usuario
		//Tabela de relacionamento N:N vc tem os ids
		 conexao = GerenciadorBd.obterConexao();
	     PreparedStatement comandoSql = null;
	     String sql = "insert into t_vec_amigos_perfil (id_perfil, id_amigos_usuario)"
	     		+ "values(?,?)";
	     comandoSql = conexao.prepareStatement(sql);
	     comandoSql.setInt(1, contatos.getId());
	     comandoSql.setInt(2, perfil.getUsuario().getId());
	     comandoSql.executeUpdate();
	     conexao.close();
	     comandoSql.close();
	     
		//insert into (tabelaRelacionamneto n:n) contato_perfil (id_contato,id_usuario) values  (?,?)
		//contato.getId, perfil.getUsuario.getId
	}
	     
			
}


