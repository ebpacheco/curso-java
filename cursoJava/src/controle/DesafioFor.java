package controle;

public class DesafioFor {

	public static void main(String[] args) {

//		String valor = "#";
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}

		// Vesao do desafio
		// Nao pode usar valor numerico para controlar o laco

		for (String valor = "#"; !valor.equals("######"); valor+= "#") {
			System.out.println(valor);			
		}
	}
}
