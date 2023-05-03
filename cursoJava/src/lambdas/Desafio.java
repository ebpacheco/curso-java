package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

//		/*
//		 * 1. A partir do produto calcular o preco real (com desconto)
//		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
//		 * 3. Frete: 3000 (100)/ < 3000 (50)
//		 * 4. Arredondar: Deixar duas casas decimais
//		 * 5. Formatar: R$1234,56
//		 */

		Produto p = new Produto("Ipad", 3235.89, 0.13);

		// Meu desafio
//		UnaryOperator<Double> precoReal = preco -> preco * (1 - p.desconto);
//		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * (1 - 0.085) : preco;
//		UnaryOperator<Double> frete = preco -> preco > 3000 ? preco - 100 : preco - 50;
//		double resultado = precoReal.andThen(imposto).andThen(frete).apply(p.preco);
//		System.out.println("R$" + df.format(resultado).replace(",", "."));

		// Desafio Professor
		Function<Produto, Double> precoFinal = produto -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco > 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(p);
		System.out.println("O preco final é: " + preco);

	}
}
