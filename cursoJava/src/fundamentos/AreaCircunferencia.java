package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // Final define a variavel como constante. Por boas praticas, usar o nome da
									// constante maiusculo

		double area = PI * raio * raio;
		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area);
	}
}