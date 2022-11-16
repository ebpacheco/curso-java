package iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
//
//Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
//
//Entrada
//O arquivo de entrada contém um valor inteiro.
//
//Saída
//Imprima a saída conforme exemplo fornecido.

public class Problema1020 {

	public static void main(String[] args) throws IOException {

		int idade;
		int ano;
		int mes;
		int dia;

		Scanner entrada = new Scanner(System.in);
		idade = entrada.nextInt();
		entrada.close();

		ano = idade / 365;
		mes = (idade % 365) / 30;
		dia = (idade % 365) % 30;

		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, mes, dia);
	}
}