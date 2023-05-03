package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("%nSalario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Joao");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu Sobrenome: ");
		String sobreNome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); //lê o "\\n" que o entrada.nextInt() deixa para trás. Sem essa linha nao seria possivel seguir para a proxima entrada
		
		System.out.print("Digite a sua cidade: ");
		String cidade = entrada.nextLine();
		
		//System.out.println("\n\nENome: " + nome + " Sobrenome: " + sobreNome);
		
		System.out.printf("%s %s tem %d anos e mora em %s", nome, sobreNome, idade, cidade);
		
		entrada.close();
	}
}
