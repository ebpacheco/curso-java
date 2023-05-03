package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		System.out.println("Informe o codigo da pessoa: ");
		int codigo = 0;
		try {
			codigo = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor invalido");
		}

		String selectSql = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String updateSql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(selectSql);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é: " + pessoa.getNome());
			entrada.nextLine();
			System.out.println("Informe um novo nome: ");
			String novoNome = entrada.nextLine();

			stmt.close();

			stmt = conexao.prepareStatement(updateSql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();

			System.out.println("Pessoa alterada com sucesso!");
		} else {
			System.out.println("Pessoa nao existe.");
		}

		conexao.close();
		entrada.close();
	}
}
