package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//Ler o numero 1
		//Ler o numero 2
		//Qual é a operacao + ou - ou * ou /
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digete o numero 1: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digete o numero 2: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Qual operacao vc deseja realizar: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
			
		entrada.close();
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
	}
}
