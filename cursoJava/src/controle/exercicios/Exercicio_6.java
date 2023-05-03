package controle.exercicios;

import java.util.Scanner;

public class Exercicio_6 {
//	6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
//	Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. 
//	Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

	public static void main(String[] args) {

		int x = 88;
		int contador = 1;
		Scanner entrada = new Scanner(System.in);

		while (contador <= 5) {

			System.out.println("Tente adivinhar o numero de 0 a 100." + " Voce tem 10 tentativas, tentativa de numero: "
					+ contador);
			int numero = entrada.nextInt();

			if (numero >= 0 && numero <= 100) {
				if (numero == x) {
					System.out.println("Voce acertou!, o numero era: " + x);
					contador += 10;
				} else if (numero < x) {
					System.out.println("O numero X é maior que " + numero);
					contador++;
				} else if (numero > x) {
					System.out.println("O numero X é menor que " + numero);
					contador++;
				} else {
					System.out.println("Infelizmente voce nao conseguiu acertar, tente novamente.");
				}
			} else {
				System.out.println("Digite um valor entre 0 e 100.");
			}

		}

		entrada.close();
	}
}
