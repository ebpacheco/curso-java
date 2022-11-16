package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// As variaveis quando sao tratadas como Wrapper, tem a primeira letra
		// maiuscula. Com excessao do int que é Integer
		Byte b = 10;
		Short s = 1000;
		Integer i = 10000;
//		Integer i = Integer.parseInt(entrada.next()); // Foi feito scanner para teste
		Long l = 100000L;

//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Float f = 123.10F;
		System.out.println(f);

		Double d = 1234.5678;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		Character c = '#';
		System.out.println(c.toString());
		System.out.println(c + "...");

	}
}
