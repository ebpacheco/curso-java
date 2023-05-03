package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Digite um valor ");
			nota = entrada.nextDouble();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Digite um valor valido: ");
			}
		}

		System.out.println("Numero de alunos validos: " + quantidadeDeNotas);

		double media = total / quantidadeDeNotas;
		System.out.println("Media é: " + media);
		entrada.close();
	}
}
