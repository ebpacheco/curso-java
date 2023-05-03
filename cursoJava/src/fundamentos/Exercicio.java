package fundamentos;

public class Exercicio {
	public static void main(String[] args) {

		// Temperatura em Fahrenheit e converta para Celsius.
		double a = 28;
		double b = (a - 32) / 1.8;
		System.out.printf("A conversao de %.2f é: " + b, a);

		// Celsius e converta para Fahrenheit.
		double c = 28;
		double d = c * 1.8 + 32;
		System.out.printf("\nA conversao de %.2f é: " + d, c);

		// Peso e a altura do usuário e imprima no console o IMC.
		double peso = 80.00;
		double altura = 1.80;
		double IMC = peso / (altura * altura);
		System.out.printf("\nO IMC é: %.2f", IMC);

		// Apresente os resultados ao quadrado e ao cubo do valor.
		double e = 2;
		double quadrado = e * e;
		double cubo = e * e * e;
		System.out.printf("\nResultado do quadrado é: %.2f, e cubo: %.2f: ", quadrado, cubo);

		// Base e da altura de um triângulo e calcule a área.
		double base = 1.5;
		double alt = 2.0;
		double area = (base * alt) / 2;

		System.out.printf("\nArea do triangulo é: " + area);
		
		//Use como exemplo f = 1, g = 12 e h = -13. Encontre o delta
		int f = 1;
		int g = 12;
		int h = -13;
		int delta = (g * g) - (4 * f * h);
		
		System.out.print("\n"+ delta);

	}
}
