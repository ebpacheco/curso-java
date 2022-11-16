package controle.exercicios;

import java.util.Scanner;

public class Exercicio_8 {
//	8. Criar um programa que receba uma palavra e imprime no console letra por letra.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a palavra");
		String palavra = entrada.next();
		char letra;

		for (int i = 0; i < palavra.length(); i++) {
			letra = palavra.charAt(i);
			System.out.println(letra);
		}

		entrada.close();
	}

}