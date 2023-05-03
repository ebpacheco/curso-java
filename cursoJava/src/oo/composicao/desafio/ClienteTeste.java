package oo.composicao.desafio;

//1 cliente
//2 compras
//cada compra com 2 itens
// cada item associada a produtos diferentes

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Eduardo");

//		Produto p1 = new Produto("Caneta", 2.70);
//		Produto p2 = new Produto("Lapis", 1.50);
//		Produto p3 = new Produto("Borracha", 1.99);
//		Produto p4 = new Produto("Caderno", 18.59);

//		Item i1 = new Item(3, p1);
//		Item i2 = new Item(2, p2);
//		Item i3 = new Item(2, p3);
//		Item i4 = new Item(5, p4);

		Compra compra1 = new Compra();
		compra1.AdicionarItem(3, "Caneta", 2.70);
		compra1.AdicionarItem(2, "Lapis", 1.50);

		Compra compra2 = new Compra();
		compra2.AdicionarItem(2, "Borracha", 1.99);
		compra2.AdicionarItem(5, "Caderno", 18.59);

		System.out.println(compra1.ObterValor());
		System.out.println(compra2.ObterValor());

		cliente.AdicionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.ObterValorTotal());
	}
}
