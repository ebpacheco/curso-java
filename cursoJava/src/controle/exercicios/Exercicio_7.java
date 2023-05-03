package controle.exercicios;

import java.util.Scanner;

public class Exercicio_7 {
//	7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. 
//	Tente utilizar a estrutura do while.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contador = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (negativo para sair): ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				contador += numero; // Isso é igual a contador = contador + numero;
				System.out.printf("\nSoma até o momento: %d\n", contador);
			}
		}
		entrada.close();
	}

}