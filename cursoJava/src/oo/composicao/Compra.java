package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> carrinho = new ArrayList<>();

	void AdicionarItem(String nome, int quantidade, double preco) {
		this.AdicionarItem(new Item(nome, quantidade, preco));
	}

	void AdicionarItem(Item item) {
		this.carrinho.add(item);
		item.compra = this;
	}

	double ObterValorTotal() {
		double total = 0;
		for (Item item : carrinho) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
