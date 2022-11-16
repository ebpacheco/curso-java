package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
//A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
//Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
//
//Entrada
//O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
//
//Saída
//Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
//Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

public class Problema1006 {

	public static void main(String[] args) throws IOException {

		double nota1;
		double nota2;
		double nota3;

		Scanner entrada = new Scanner(System.in);
		nota1 = entrada.nextDouble() * 2.0;
		nota2 = entrada.nextDouble() * 3.0;
		nota3 = entrada.nextDouble() * 5.0;
		entrada.close();

		double media = (nota1 + nota2 + nota3) / 10;

		System.out.printf("MEDIA = %.1f%n", media);

	}

}
