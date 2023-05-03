package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
		}

		if (media < 7 && media >= 5) {
			System.out.println("Recuperacao");
		}

		// Posso definir na variavel e passar ela no IF
		boolean criterio = media < 5 && media >= 0;
		if (criterio) {
			System.out.println("Reprovado");
		}

//		if (media < 5 && media >= 0) {
//			System.out.println("Reprovado");
//		}

		entrada.close();

	}
}