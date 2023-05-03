package excecao.personalizadaA;

public class Validar {

	private Validar() {
	}

	public static void aluno(Aluno aluno) {
		if (aluno == null) {
			throw new IllegalArgumentException("O valor está nulo");
		}

		if (aluno.nome == "" || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}

		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}

}
