package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

public class Problema1038 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		int codigo;
		double valorAPagar = 0;
		int quantidade;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do cardapio: ");
		codigo = entrada.nextInt();

		switch (codigo) {
		case 1: {
			valorAPagar = 4.00;
			break;
		}
		case 2: {
			valorAPagar = 4.50;
			break;
		}
		case 3: {
			valorAPagar = 5.00;
			break;
		}
		case 4: {
			valorAPagar = 2.00;
			break;
		}
		case 5: {
			valorAPagar = 1.50;
			break;
		}

		}

		System.out.println("Digite a quantidade do pedido: ");
		quantidade = entrada.nextInt();
		entrada.close();

		double total = valorAPagar * quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
	}
}