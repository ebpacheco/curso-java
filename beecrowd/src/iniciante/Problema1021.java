package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
//As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
//
//Entrada
//O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//
//Saída
//Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
//
//Obs: Utilize ponto (.) para separar a parte decimal.

public class Problema1021 {

	public static void main(String[] args) throws IOException {

		double valor;
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

		Scanner entrada = new Scanner(System.in);
		valor = entrada.nextDouble();
		entrada.close();

		if (valor <= 0 || valor >= 1000000) {
			System.out.println("Valor invalido!" + "\n");
		} else {
			System.out.println("NOTAS:");
			for (int nota : notas) {
				System.out.printf((int) (valor / nota) + " nota(s) de R$ %d.00" + "\n", nota);
				valor = valor % nota;
			}
			System.out.println("MOEDAS:");
			for (double nota2 : moedas) {
				// System.out.printf((int) (valor / nota2) + " moeda(s) de R$ %.2f" + "\n", nota2);
				System.out.print((int) (valor / nota2) + " moeda(s) de R$ "	+ String.format("%.2f", nota2).replace(",", ".") + "\n");
				valor = valor % nota2;
			}
		}
	}
}
