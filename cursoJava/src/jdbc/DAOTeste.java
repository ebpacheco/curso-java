package jdbc;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "João da Silva");
		dao.incluir(sql, "Ana Julia");
		// Nesse caso o system out retorna o ID por conta do metodo no DAO
		System.out.println(dao.incluir(sql, "Djalma Pereira"));

		dao.close();
	}
}
