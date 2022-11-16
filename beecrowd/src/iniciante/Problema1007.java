package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//
//Entrada
//O arquivo de entrada contém 4 valores inteiros.
//
//Saída
//Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

public class Problema1007 {

	public static void main(String[] args) throws IOException {

		int a;
		int b;
		int c;
		int d;

		Scanner entrada = new Scanner(System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		entrada.close();

		int diferenca;
		diferenca = (a * b) - (c * d);
		System.out.printf("DIFERENCA = %d%n", diferenca);
	}

}
