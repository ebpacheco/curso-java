package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//		int total = 0;
//		for (int n : nums) {
//			total += n;
//		}
//		System.out.println(total);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;		
		
		//Aqui podemos usar parallelStream pq não tem valor inicial, sendo assim não tera soma paralela e não irá alterar o resultado final
		Integer total1 = nums.parallelStream().reduce(soma).get(); // Importante usar o Integer para não causa erro de
																	// NullPointerException
		System.out.println(total1);

		// Aqui não podemos usar parallelStream pq tem valor inicial, sendo assim terá soma paralela(100+1,100+2,100+3...),
		// e irá alterar o resultado final (945)
//		Integer total2 = nums.parallelStream().reduce(100,soma);
//		System.out.println(total2);

		Integer total3 = nums.stream().reduce(100, soma); // Aqui como usamos um valor inicial do tipo "int"
		// ele entende que tudo sera Int e não precisa usar o .get
		System.out.println(total3);

		// Resultado foi um Opcional<Integer>...
		nums.stream()
		.filter(n -> n > 5)
		.reduce(soma)
		.ifPresent(System.out::println); //Se existir dado, ele irá realizar a condicao passada

	}
}
