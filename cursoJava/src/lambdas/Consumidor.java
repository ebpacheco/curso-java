package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		Produto p1 = new Produto("Caneta", 2.39, 0.10);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Caderno", 15.90, 0.20);
		Produto p3 = new Produto("Notebook", 2875.99, 0.25);
		Produto p4 = new Produto("Lapis", 3.20, 0.15);
		Produto p5 = new Produto("Borracha", 2.49, 0.10);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);

	}
}
