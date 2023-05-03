package excecao.personalizadaB;

public class TesteValidacao {

	public static void main(String[] args) {

		Aluno aluno;
		try {
			aluno = new Aluno("Eduardo", 2);
			Validar.aluno(aluno);
//			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		// Poderia ser em um unico bloco
//		} catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println("fim");
	}
}
