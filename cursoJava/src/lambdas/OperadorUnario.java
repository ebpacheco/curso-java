package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = n -> n + 2;

		UnaryOperator<Integer> vezesDois = n -> n * 2;

		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0); // andThen Comeca pelo primeiro
																					// >>>>>>
		System.out.println(resultado1);

		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0); // compose Comeca pelo ultimo
																					// <<<<<<
		System.out.println(resultado2);

//		System.out.println(maisDois.apply(5));
//		System.out.println(vezesDois.apply(5));
//		System.out.println(aoQuadrado.apply(5));

	}
}
