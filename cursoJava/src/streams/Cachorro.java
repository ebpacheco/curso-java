package streams;

public class Cachorro {

	public String nome;
	public double peso;
	public String raca;
	public boolean doacao;

	public Cachorro(String nome, double peso, String raca, boolean doacao) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.raca = raca;
		this.doacao = doacao;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", peso=" + peso + ", raca=" + raca + ", adocao=" + doacao;
	}

}
