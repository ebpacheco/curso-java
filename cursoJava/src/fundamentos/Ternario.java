package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		double media = 7.6;

		String resultadoParcial = media >= 5 ? "em recuperacao." : "reprovado.";
		String resultadoFinal = media >= 7 ? "aprovado." : resultadoParcial;

		//String resultadoFinal = media >= 7 ? "aprovado." : media >= 5 ? "em recuperacao." : "reprovado."; 

		System.out.println("O aluno está " + resultadoFinal);
	}
}
