package jogo;

public class FichaDeJogador {

	String nome;
	String classe;
	int vida;
	int ataque;

	public FichaDeJogador(String nome, String classe, int vida, int ataque) {
		this.nome = nome;
		this.classe = classe;
		this.vida = vida;
		this.ataque = ataque;
	}

	void recuperarVida() {
		this.vida++;
	}

	int AtaqueJogador(int ataque, int vida) {
		return this.vida = this.vida - ataque;
	}
}
