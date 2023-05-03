package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {

		boolean trabalho1 = false;
		boolean trabalho2 = false;

		// Operadores binário
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;

		// Operador unário
		boolean ficouSaudavel = !comprouSorvete;

		System.out.println("Comprou TV de 50? " + comprouTV50);
		System.out.println("Comprou TV de 32? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Ficou Saudavel? " + ficouSaudavel);

	}
}