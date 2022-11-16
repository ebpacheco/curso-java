package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		int a1 = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2);

		int b1 = ((1 - 5) * (2 - 7)) / 2;
		int b2 = (int) Math.pow(b1, 2);
		
		int c = a1 - b2;
		
		int d = (int) Math.pow(c, 3);		

		int e = (int) Math.pow(10, 3);

		int resultado = d / e;

		System.out.println(resultado);
	}
}
