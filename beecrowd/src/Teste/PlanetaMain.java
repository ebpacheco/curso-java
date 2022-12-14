package Teste;

import java.util.Scanner;

public class PlanetaMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o planeta que deseja viajar");
		String planeta = entrada.next();

		try {
			PlanetaTeste p1 = new PlanetaTeste(planeta.toUpperCase());
			p1.viajar();
		} catch (IllegalArgumentException e) {
			System.out.println("Esse planeta nao existe");
		} finally {
			entrada.close();
		}
	}
}
