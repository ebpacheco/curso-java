package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

		System.out.println(isPar.test(22)); // true
		System.out.println(isPar.test(23)); // false
		System.out.println();
		System.out.println(isPar.and(isTresDigitos).test(22)); // false
		System.out.println(isPar.and(isTresDigitos).test(122)); // true
		System.out.println(isPar.and(isTresDigitos).negate().test(22)); // true
		System.out.println(isPar.and(isTresDigitos).negate().test(122)); // false
		System.out.println();
		System.out.println(isPar.or(isTresDigitos).test(22)); // true
		System.out.println(isPar.or(isTresDigitos).test(23)); // false
		System.out.println(isPar.or(isTresDigitos).test(123)); // true
		
	}
}
