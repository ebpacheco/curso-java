package fundamentos;

public class Inferencia {
	// Java aceita a declaracao VAR para criar variavel e descobrir qual o tipo, mas
	// pra isso funcionar a declaracao precisa ser feita logo na sequencia.

	public static void main(String[] args) {

		double a = 123.45;
		System.out.println(a);

		double b;
		b = 123.45;
		System.out.println(b);

		var c = 456.78;
		c = 10;
		System.out.println(c);

		// Exemplo nao vai dar certo pq nao foi declarado logo na criacao da variavel
		// VAR.
//		var d;
//		d = 456.78;
//		System.out.println(d);

		var e = "Texto";
		System.out.println(e);

		// Exemplo nao vai dar certo pq o VAR reconheceu a variavel como double na
		// declaracao e tentamos inserir um valor inteiro.
//		var f = 20;
//		f = 20.10;
//		System.out.println(f);
	}
}
