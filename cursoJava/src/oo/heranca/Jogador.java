package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;

	// Quando nao é um construtor padrao na classe pai, precisamos criar tambem o
	// construtor na classe filha.
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	boolean atacar(Jogador oponente) {
	public void atacar(Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			this.vida -= 10;
//			return true;
		} else if (deltaY == 0 && deltaX == 1) {
			this.vida -= 10;
//			return true;
		}
//		return false;
	}

	public void andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;

		}
	}
}
