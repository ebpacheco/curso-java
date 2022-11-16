package streams;

import java.util.Arrays;
import java.util.List;

public class Apendice {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
		lista.stream().forEach(System.out::println);

		// Operacao intermediaria skip, limit, district, filter e map

//		lista.stream().skip(2) // ignora os dois primeiros números
//				.limit(9) // limita a 9 números
//				.distinct() // ignora números iguais
//				.forEach(System.out::print);

//		lista.stream().filter(n -> n % 2 == 0) // filtra apenas os números pares
//				.forEach(System.out::print);

//		lista.stream().map(n -> n * 2) // multiplica cada item por 2
//				.forEach(i -> System.out.print(i + " ")); // imprime todos os itens com o espaco que está concatenado

		// Lembrando que os valores alterados no map não alteram a lista(variavel)
		// original.

		//

		// Ja nesse caso a seguir estamos atribuindo o valor alterado para uma variavel.
		// Operacao final min, max, count e collect

//		Optional<Integer> maiorNumero = lista.stream() // Operacao construtora(builder)
//				.map(n -> n * 2) // multiplica cada item por 2 - Operacao intermediaria
//				.max(Comparator.naturalOrder()); // pega o maior item pela ordem natural - Operacao final																		
//		System.out.println(maiorNumero.get()); // imprime o maior numero

//		Optional<Integer> menorNumero = lista.stream() // Operacao construtora(builder)
//				.map(n -> n * 2) // multiplica cada item por 2 - Operacao intermediaria
//				.min(Comparator.naturalOrder()); // pega o menor item pela ordem natural - Operacao final		
//		System.out.println(menorNumero.get()); // imprime o menor numero

//		long contador = lista.stream()
//				.filter(n -> n % 2 == 0) // filtra apenas os números pares
//				.count(); // conta quantos itens restam na stream
//		System.out.println(contador);

//		List<Integer> novaLista = lista.stream()
//				.filter( n -> n % 2 == 0) // mantém apenas números pares
//				.map(n -> n * 2) // multiplica cada item por 2
//				.collect(Collectors.toList()); // coleta todos os itens em uma nova lista (novaLista)
//		System.out.println(novaLista);

//		Map<Boolean, List<Integer>> mapa = lista.stream() // Recebe os valores boolean do groupingBy e cria uma List<Integer>
//				.map(n -> n * 2) // multiplica cada item por 2
//				.collect(Collectors.groupingBy(n -> n > 8)); // agrupa itens baseado no resultado da comparação
//		System.out.println(mapa);

//		String string = lista.stream()
//				.map(s -> s.toString()) // eu inventei pra substituir o method reference
//				.map(String::valueOf) // transforma cada item em String
//				.collect(Collectors.joining(";")); // junta todas as Strings em uma única separada por ';'
//		System.out.println(string);
	}
}
