package jogo;

public class FichaDeMonstro {

	String nome;
	int vida;
	int ataque;

	public FichaDeMonstro(String nome, int vida, int ataque) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
	}

	int AtaqueMonstro(int ataque, int vida) {
		return this.vida = this.vida - ataque;
	}

}
