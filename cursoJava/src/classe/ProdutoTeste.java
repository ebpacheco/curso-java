package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		// Duas maneiras de chamar o construtor produto, essa com o tipo "Produto" e os
		// valores em parametros
		Produto p1 = new Produto("Notebook", 4356.89);

		// Essa com o tipo "var"que identifica qual é o tipo passado, e usando
		// construtor padrao. Só é possivel pq existe um construtor padrao na classe
		// Produto.
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
//		p2.desconto = 0.29;

		// Alterando a variavel de classe, variavel Static
		Produto.desconto = 0.30;
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());

//		double precoFinal1 = p1.preco * (1 - p1.desconto);

		double precoFinal1 = p1.precoComDesconto();

//		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaFinal = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Média do carrinho é: R$ %.2f. \n\n", mediaFinal);
	}
}
