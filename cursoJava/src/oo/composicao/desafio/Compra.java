package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<>();

//	void AdicionarItem(int qtde, Produto p) {
//		this.itens.add(new Item(qtde, p));
//	}

	void AdicionarItem(int qtde, String nome, double preco) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(qtde, produto));
	}

	double ObterValor() {
		double valor = 0;
		for (Item item : itens) {
			valor += item.quantidade * item.produto.preco;
		}
		return valor;
	}
}
