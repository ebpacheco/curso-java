package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
//A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
//
//Entrada
//A entrada contem as coordenadas de um ponto.
//
//Saída
//A saída deve apresentar o quadrante em que o ponto se encontra.

public class Problema1041 {

	public static void main(String[] args) throws IOException {

		double x;
		double y;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o valor de X: ");
		x = entrada.nextDouble();
		System.out.println("Entre com o valor de Y: ");
		y = entrada.nextDouble();
		entrada.close();
		
		

	}

}
