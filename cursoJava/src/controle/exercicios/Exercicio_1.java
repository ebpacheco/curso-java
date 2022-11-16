package controle.exercicios;

import java.util.Scanner;

public class Exercicio_1 {
//	1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

	public static void main(String[] args) {

//		int numero = 6;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numero = entrada.nextInt();

		if (numero > 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.printf("Numero %d é par.", numero);
			} else {
				System.out.printf("Numero %d é impar.", numero);
			}
		} else {
			System.out.println("Digite um numero de 0 a 10");
		}

		entrada.close();
	}
}