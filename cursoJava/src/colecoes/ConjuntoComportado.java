package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<Integer> nums = new HashSet<>(); // HashSet nao é ordenado na ordem que foi inserido
		nums.add(9);
		nums.add(1);
		nums.add(82);
		nums.add(5);

		for (int n : nums) {
			System.out.println(n);
		}

		Set<String> listaAprovados = new TreeSet<>(); // TreeSet ordena a String por ordem alfabetica
		listaAprovados.add("Pedro");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Ana");

		for (String lista : listaAprovados) {
			System.out.println(lista);
		}

	}
}
