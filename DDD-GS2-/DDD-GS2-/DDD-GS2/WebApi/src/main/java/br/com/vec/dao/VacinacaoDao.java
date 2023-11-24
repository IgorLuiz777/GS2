package br.com.vec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.vec.entity.Vacinacao;

public class VacinacaoDao {
	
private Connection conexao;
	
	public void cadastrar(Vacinacao vacinacao) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "insert into t_vec_vacinacao (id_vacinacao," +
		"st_vacina, nm_vacina) values (?,?,?)";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setInt(1, vacinacao.getId());
		comandoSql.setString(2, vacinacao.getTomouVacina());
		comandoSql.setString(3, vacinacao.getNome());
	}
	
	public void excluir(int id) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "delete from t_vec_vacinacao where id_vacinacao = ?";
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
	
	public void alterar(Vacinacao vacinacao) throws SQLException {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		String sql = "update t_vec_vacinacao set st_vacina = ?, nm_vacina = ?"
				+ "where id_vacinacao = ?";
		comandoSql = conexao.prepareStatement(sql);
		comandoSql.setString(1, vacinacao.getTomouVacina());
		comandoSql.setString(2, vacinacao.getNome());
		comandoSql.setInt(3, vacinacao.getId());
		comandoSql.executeUpdate();
		conexao.close();
		comandoSql.close();
	}

}
