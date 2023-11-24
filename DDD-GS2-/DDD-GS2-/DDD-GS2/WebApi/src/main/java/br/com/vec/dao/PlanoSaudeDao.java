package br.com.vec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.vec.entity.PlanoSaude;
import br.com.vec.entity.Vacinacao;

public class PlanoSaudeDao {
	
	private Connection conexao;
	
	public void cadastrar(PlanoSaude planoSaude) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "insert into t_vec_plano_saude (id_plano_saude," +
		"nm_plano_saude) values (?,?)";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setInt(1, planoSaude.getId());
		comandoSql.setString(2, planoSaude.getNome());	
	}
	
	public void excluir(int id) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "delete from t_vec_plano_saude where id_plano_saude = ?";
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
	
	public void alterar(PlanoSaude planoSaude) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "update t_vec_plano_saude set nm_plano_saude = ?"
				+ "where id_plano_saude = ?";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setString(1, planoSaude.getNome());
		comandoSql.setInt(2, planoSaude.getId());
		comandoSql.executeUpdate();
		conexao.close();
		comandoSql.close();
	}
	
}
