package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		
//		final String url = "jdbc:mysql://localhost:3306";
		// Nesse caso a aplicacao nao vai verificar o certificado do servidor mas vai usar uma conexao segura entre o java e o o mysql.
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true"; 
		// Nesse caso a aplicacao vai usar uma conexao nao segura entre o java e o o mysql.
//		final String url = "jdbc:mysql://localhost:3306?useSSL=false"; 
		final String usuario = "root";
		final String senha = "root";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Conexao efetuada com sucesso!");
		conexao.close();
	}
}
