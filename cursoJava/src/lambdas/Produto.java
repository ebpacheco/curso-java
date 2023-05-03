package lambdas;

import java.text.DecimalFormat;

public class Produto extends Object {

	final String nome;
	final double preco;
	final double desconto;

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	DecimalFormat df = new DecimalFormat("0.00");

	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + ", preco = " + df.format(precoFinal);
	}

}
