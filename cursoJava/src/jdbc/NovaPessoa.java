package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = entrada.next();

		Connection conexao = FabricaConexao.getConexao();

		// Nunca usar concatenacao para passar valores para o BD
		// Deixa brexa para o usuario fazer um SQL INJECTION
//		String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')";

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);

		// Nesse exemplo passamos 2 parametros para o BD, nome e codigo
		// e os valores sao definidos pelo stmt, 1 para o primeiro parametro = nome
		// e 2 para o segundo parametro = codigo. O codigo foi definido manualmente
//		String sql = "INSERT INTO pessoas (nome,codigo) VALUES (?,?)";
//		PreparedStatement stmt = conexao.prepareStatement(sql);
//		stmt.setString(1, nome);
//		stmt.setInt(2, 100);

		stmt.execute();
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}
