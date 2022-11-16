package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

//Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
//Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
//
//Entrada
//Leia três valores de ponto flutuante (double) A, B e C.
//
//Saída
//Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
//Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

public class Problema1036 {

	public static void main(String[] args) throws IOException {

		DecimalFormat df = new DecimalFormat("0.00000");
		double a;
		double b;
		double c;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		entrada.close();

		double delta = (b * b) - (4 * a * c);
		double r1 = (-b + Math.sqrt(delta)) / (2 * a);
		double r2 = (-b - Math.sqrt(delta)) / (2 * a);

		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular\n");
		} else {
			System.out.println("R1 = " + df.format(r1).replace(",", ".") + "\n");
			System.out.println("R2 = " + df.format(r2).replace(",", ".") + "\n");
		}
	}
}