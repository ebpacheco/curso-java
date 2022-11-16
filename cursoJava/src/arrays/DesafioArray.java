package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		System.out.print("Digite o tamanho do Array: ");
		int qtdeNotas = entrada.nextInt();
		double[] notas = new double[qtdeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite o valor da nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		double total = 0.0;
		for (double nota : notas) {
			total += nota;
		}

		double media = total / notas.length;
		System.out.print(Arrays.toString(notas) + "\n");
		System.out.print(df.format(media));
		entrada.close();
	}
}
