package controle.exercicios;

import java.util.Scanner;

public class Exercicio_9 {
//	9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contador = 0;

		System.out.println("Digite 10 valores para saber qual é o de maior numero");
		for (int i = 0; i < 10; i++) {
			int valor = entrada.nextInt();
			if (valor > contador) {
				contador = valor;
			}
		}

		System.out.println("O maior valor é: " + contador);
		entrada.close();
	}
}