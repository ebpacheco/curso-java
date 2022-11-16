package controle;

public class For1 {

	public static void main(String[] args) {

//		int contador = 1;
//
//		while (contador <= 20) {
//			System.out.printf("i = %d\n",contador);
//			contador++;
//		}

		// Exemplo acima seria do While determinado, quando usamos um valor determinado
		// é melhor usar o For.
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}

		// O For é divido em 3 partes, primeira inicializacao da variavel, nesse exemplo
		// estamos declarando fora do for. segunda parte é a expressao. Terceira
		// parte é a modificacao da variavel
		// Exemplo que nao faz muito sentido:
		int x = 2;
		for (; x <= 10;) {
			System.out.printf("X = %d\n", x);
			x++;
		}

		// Laco infinito
		for (;;) {
			System.out.println("Fim!");
		}

	}
}
