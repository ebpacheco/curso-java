package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C

		double entrada = 86.0;
		final double AJUSTE = 32.0;
		final double FATOR = 5.0 / 9.0;
		double resultado = (entrada - AJUSTE) * FATOR;

		System.out.println("O resultado é: " + resultado);
	}
}
