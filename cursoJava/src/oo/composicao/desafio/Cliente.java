package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	void AdicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double ObterValorTotal() {
		double valorTotal = 0;
		for (Compra compra : compras) {
			valorTotal += compra.ObterValor();
		}
		return valorTotal;
	}
}
