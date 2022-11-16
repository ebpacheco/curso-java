package arrays;

import java.text.DecimalFormat;

public class ExercicioForEach {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		DecimalFormat df = new DecimalFormat("0.00");

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		double totalAlunoA = 0;
		for (double notaAlunoA : notasAlunoA) {
			totalAlunoA += notaAlunoA;
		}
		System.out.println(df.format(totalAlunoA / notasAlunoA.length)); // Media

		final double notaArmazenada = 5.9;
		double[] notasAlunosB = { 6.9, 8.9, notaArmazenada, 10 };

		double totalAlunoB = 0;
		for (double notaAlunoB : notasAlunosB) {
			totalAlunoB += notaAlunoB;
		}
		System.out.println(df.format(totalAlunoB / notasAlunosB.length)); // Media
	}
}
