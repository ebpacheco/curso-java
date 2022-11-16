package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi(2, 1);

		Monstro monstro = new Monstro();
		monstro.x = 2;
		monstro.y = 2;

		Monstro monstro2 = new Monstro(4, 5);

		System.out.println("Vida do heroi: " + heroi.vida);
		System.out.println("Vida do monstro: " + monstro.vida);
		System.out.println();

		heroi.atacar(monstro);
		monstro.atacar(heroi);

		System.out.println("Vida do heroi: " + heroi.vida);
		System.out.println("Vida do monstro: " + monstro.vida);

		System.out.println(monstro2.x);
		System.out.println(monstro2.y);
	}
}
