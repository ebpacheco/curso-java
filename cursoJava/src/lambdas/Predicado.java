package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> prod.preco >= 750;

		Produto produto1 = new Produto("Notebook", 4500, 0.15);
		System.out.println(isCaro.test(produto1));
	}
}
