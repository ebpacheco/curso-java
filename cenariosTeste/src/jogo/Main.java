package jogo;

public class Main {

	public static void main(String[] args) {
		FichaDeJogador f1 = new FichaDeJogador("Eduardo", "Orc", 10, 5);
		FichaDeJogador f2 = new FichaDeJogador("Natany", "Humano", 10, 3);

		FichaDeMonstro m1 = new FichaDeMonstro("Demogorgon", 50, 2);

		System.out.printf("O jogador %s, total de vida: %d é da classe %s e tem o ataque %d%n", f1.nome, f1.vida,
				f1.classe, f1.ataque);

		System.out.printf("O jogador %s, total de vida: %d é da classe %s e tem o ataque %d%n", f2.nome, f2.vida,
				f2.classe, f2.ataque);

		f1.AtaqueJogador(m1.ataque, f1.vida);
		System.out.println(f1.vida);

		m1.AtaqueMonstro(f1.ataque, m1.vida);
		System.out.println(m1.vida);
		
		f1.AtaqueJogador(m1.ataque, f1.vida);
		System.out.println(f1.vida);

		m1.AtaqueMonstro(f1.ataque, m1.vida);
		System.out.println(m1.vida);
	}

}
