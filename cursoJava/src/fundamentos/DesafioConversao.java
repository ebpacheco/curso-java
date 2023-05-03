package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// Criar um scanner e pegar 3 String NEXTLINE, receber os 3 ultimos salarios e
		// calcular a media do salario, deve funcionar tanto com . ou ,
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro salario: ");
		String salario1 = entrada.next().replace(",", ".");

		System.out.print("Digite o segundo salario: ");
		String salario2 = entrada.next().replace(",", ".");

		System.out.print("Digite o terceiro salario: ");
		String salario3 = entrada.next().replace(",", ".");

		entrada.close();

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		double soma = (valor1 + valor2 + valor3) / 3;
		System.out.println("Media é: " + soma);

	}
}
