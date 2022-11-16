package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // Conversao Implicita
		System.out.println(a);

		float b = (float) 1.12345; // Conversao Explicita (CAST) //Maneira simple seria colocando o F no final. ex:
									// "1.12345F" sem o "(FLOAT)"
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // Conversao Explicita (CAST)
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e; // Conversao Explicita (CAST)
		System.out.println(e);
		System.out.println(f);
	}
}
