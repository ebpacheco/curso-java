package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
//Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
//Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
//
//Entrada
//O arquivo de entrada contém um número inteiro.
//
//Saída
//Imprima o tempo necessário seguido da mensagem "minutos".

public class Problema1016 {

	public static void main(String[] args) throws IOException {

		final int x = 60;
		final int y = 90;

		int km;
		Scanner entrada = new Scanner(System.in);
		km = entrada.nextInt();
		entrada.close();

		int distancia = y - x;
		int tempo = 60 / distancia;
		
		int calculo = km * tempo;

		System.out.printf("%d minutos%n", calculo);

	}

}