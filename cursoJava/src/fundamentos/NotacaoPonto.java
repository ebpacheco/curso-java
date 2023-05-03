package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";

		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat(" !!!!!!!!!!!");

		System.out.println(s);

		System.out.println("Duda".toUpperCase());

		String y = "Bom dia X"
				.replace("X", "Silvia")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		//Tipos primitivos nao tem o operador ponto "."
		
		// int a = 3;
		// a.
		//a "ponto" nao ira apresentar nada pois é tipo primitivo
		
	}
}
