package fundamentos;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		System.out.println(c);

		c %= 2; // c = c % 2; 0 ou 1, 0 quando o numero é par, e 1 se o numero é impar.
		System.out.println(c);
	}
}
