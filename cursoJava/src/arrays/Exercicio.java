package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		DecimalFormat df = new DecimalFormat("0.00");

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
//		System.out.println(notasAlunoA[4]);

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(df.format(totalAlunoA / notasAlunoA.length)); // Media

		final double notaArmazenada = 5.9;
		double[] notasAlunosB = { 6.9, 8.9, notaArmazenada, 10 };

		System.out.println(Arrays.toString(notasAlunosB));

		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalAlunoB += notasAlunosB[i];
		}
		System.out.println(df.format(totalAlunoB / notasAlunosB.length));
	}
}
