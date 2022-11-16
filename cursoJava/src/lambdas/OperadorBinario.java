package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

//		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));

//		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7.0 ? "Aprovado" : "Reprovado";
//		System.out.println(resultado.apply(9.7, 4.1));

		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double nota = ((n1 + n2) / 2);
			return nota >= 7.0 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(9.7, 4.1));

		Function<Double, String> conceito = nota -> nota >= 7.0 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
	}
}
