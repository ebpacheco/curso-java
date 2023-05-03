package classe;

public class DesafioPessoa {

	String nome;
	double peso;

	DesafioPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(DesafioComida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String apresentar() {
		return "Nome: " + this.nome + ", hoje esta pesando: " + this.peso + "Kg.";
	}
}
