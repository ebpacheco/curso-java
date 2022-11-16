package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
//
//Entrada
//O arquivo de entrada contém um valor inteiro N.
//
//Saída
//Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

public class Problema1019 {

	public static void main(String[] args) throws IOException {

		int tempoSegundos;
		int hora = 0;
		int minuto = 0;
		int segundo = 0;

		Scanner entrada = new Scanner(System.in);
		tempoSegundos = entrada.nextInt();
		entrada.close();

		hora = tempoSegundos / 3600;
		minuto = (tempoSegundos % 3600) / 60;
		segundo = tempoSegundos % 60;

		System.out.printf("%d:%d:%d%n", hora, minuto, segundo);
	}
}
