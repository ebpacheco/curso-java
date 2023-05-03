package excecao;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;

		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Ocorreu um erro por que o nome do aluno é null.");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			// Nesse caso eu consigo retornar a mensagem de erro com getMessage
			// pq o tipo é especifico(ArithmeticException) e nao é Exception.
			System.out.println("Mensagem de erro: " + e.getMessage());
		}

		System.out.println("Fim");
	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
