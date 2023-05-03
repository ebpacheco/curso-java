package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "Eduardo";
		c1.AdicionarItem("Caneta", 20, 7.45);
		c1.AdicionarItem("Borracha", 12, 3.89);
		c1.AdicionarItem(new Item("Caderno", 3, 18.79));

		System.out.println(c1.carrinho.size());

		System.out.println(c1.ObterValorTotal());
	}
}
