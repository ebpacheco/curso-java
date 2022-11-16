package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola pessoal!".charAt(2));

		String s = "Boa tarde";
		// s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		
		var nome = "Eduardo";
		var sobreNome = "Pacheco";
		var idade = 29;
		var salario = 1234.5678;
		
		System.out.println("\nNome: " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario);
		//Outro jeito de fazer o exemplo acima é criar uma variavel:
		String outroExemplo = "Nome: " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario;
				System.out.println("\n"+ outroExemplo);
		
		//Usando o printf é possivel realizar a chamada da variavel aparte do caracter %... Exemplo:
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobreNome, idade, salario); // o %.2f quer dizer que so sera apresentado 2 digitos apos o ponto "."

		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobreNome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("quer"));
		System.out.println("Frase qualquer".indexOf("quer"));
		System.out.println("Frase qualquer".substring(6));	
		System.out.println("Frase qualquer".substring(6,10));				
	}
}
