package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// Colecoes nao aceitam tipo primitivo.
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add("x"); // char -> Character

		System.out.println("Tamanho da colecao: " + conjunto.size()); // Para visualizar o tamanho das collections nao usamos o .lenght e sim .size

		conjunto.add("teste"); // Esse valor sera adicionado pois o t esta minusculo, logo nao existe esse valor na colecao
		conjunto.add("Teste"); // Esse valor nao sera adicionado pois ja existe o mesmo valor na colecao
		System.out.println("Tamanho da colecao: " + conjunto.size());

		System.out.println(conjunto.remove("Teste")); // Esse valor sera true e sera removido da colecao
		System.out.println(conjunto.remove("X")); // Ese valor sera false pois nao existe o X maiusculo na colecao
		System.out.println(conjunto.remove("x")); // Esse valor sera true e sera removido da colecao

		System.out.println("Tamanho da colecao: " + conjunto.size());

		System.out.println(conjunto.contains("x")); // Esse valor sera false pois nao contem x na colecao, foi removido	na linha 27
		System.out.println(conjunto.contains(1)); // Esse valor sera true pois existe 1 na colecao
		System.out.println(conjunto.contains(true)); // Esse valor sera true pois existe o true na colecao

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // Uniao entre dois conjuntos "addAll", juntando o nums no conjunto
		conjunto.retainAll(nums); // Adicionando ao conjunto só oq é igual no nums
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpando a colecao conjunto
		System.out.println(conjunto);

	}
}
