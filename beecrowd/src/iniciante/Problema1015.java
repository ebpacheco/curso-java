package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
//
//Entrada
//O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
//
//Saída
//Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

public class Problema1015 {

	public static void main(String[] args) throws IOException {

		double x1;
		double y1;
		double x2;
		double y2;

		Scanner entrada = new Scanner(System.in);
		x1 = entrada.nextDouble();
		y1 = entrada.nextDouble();
		x2 = entrada.nextDouble();
		y2 = entrada.nextDouble();
		entrada.close();

		double distancia = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		distancia = Math.sqrt(distancia);

		System.out.printf("%.4f%n", distancia);
	}

}