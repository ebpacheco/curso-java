package streams;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTeste {

	public static Optional<Integer> converterNumero(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {

//		String s = "Teste";
//		String s = "123";

//		Optional<Integer> numero = converterNumero(s);
//		System.out.println(numero);
//		numero.ifPresent(i -> System.out.println(i)); //ifPresent

		// ifPresent
//		converterNumero(s).ifPresent(System.out::println);

		// orElse
//		Integer numero = converterNumero(s).orElse(5);
//		System.out.println(numero);

		// orElseGet
//		Integer numero = converterNumero(s).orElseGet(() -> {return operacaoPesada()}); //Apenas exemplo "Operacao pesada"
//		System.out.println(numero);

		// orElseThrow
//		Integer numero = converterNumero(s).orElseThrow(() -> new NullPointerException("Valor invalido")); 
//		System.out.println(numero);

		// Usando stream
//		Optional<Integer> numero = Stream.of(2, 1, 3).findFirst();
//		System.out.println(numero.get());

		Stream.of(2, 1, 3).findFirst().ifPresent(i -> System.out.println(i));

	}
}
