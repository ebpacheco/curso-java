package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Joao"); // Put serve para "colocar", se já existir o ID ele ira alterar
		usuarios.put(1, "Roberto"); // Nesse caso ira alterar o Joao por Roberto
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet()); // Ira apresentar o array das chaves
		System.out.println(usuarios.values()); // Ira apresentar o array dos valores
		System.out.println(usuarios.entrySet()); // Ira apresentar o array das chaves + valores

		System.out.println(usuarios.containsKey(20)); // Ira retornar True ou False se existir 20 na chave
		System.out.println(usuarios.containsValue("Rebeca")); // Ira retornar True ou False se existir o Rebeca no valor

		System.out.println(usuarios.get(4)); // Ira retornar o valor da chave 4
		System.out.println(usuarios.get(20)); // Ira retornar o valor da chave 20 (Nao é o index)
//		System.out.println(usuarios.remove(4)); // Estou removendo só pela chave
//		System.out.println(usuarios.remove(20, "Ricardo")); // Estou removendo pela chave + valor
		System.out.println();

		for (Integer chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
		}
		System.out.println();

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}

	}
}
