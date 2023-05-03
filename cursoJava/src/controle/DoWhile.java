package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Para sair digite as palavras magicas: ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		entrada.close();
	}
}
