package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari(400);
		System.out.println(ferrari.velocidadeDoAr());
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();

		ferrari.frear();
		System.out.println(ferrari);

		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);

		ferrari.acelerar();
		System.out.println(ferrari);

		System.out.println();

		Civic civic = new Civic();
		civic.acelerar();
		System.out.println(civic);

		civic.acelerar();
		System.out.println(civic);

		civic.acelerar();
		civic.frear();
		System.out.println(civic);

		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println(civic);

	}
}
