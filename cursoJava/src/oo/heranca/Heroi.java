package oo.heranca;

public class Heroi extends Jogador {

	public Heroi(int x, int y) {
		super(x, y);
	}

	// Esse é um outro jeito de sobreescrever
	@Override
	public void atacar(Jogador oponente) {
		super.atacar(oponente);
		super.atacar(oponente);
		super.atacar(oponente);
	}
	// Esse é um jeito de sobreescrever o metodo (Jeito ctrl c ctrl v)
//	void atacar(Jogador oponente) {
//		int deltaX = Math.abs(this.x - oponente.x);
//		int deltaY = Math.abs(this.y - oponente.y);
//
//		if (deltaX == 0 && deltaY == 1) {
//			this.vida -= 10;
//
//		} else if (deltaY == 0 && deltaX == 1) {
//			this.vida -= 10;
//		}
//
//	}
}
