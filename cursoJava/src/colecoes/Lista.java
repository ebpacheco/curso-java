package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

//		ArrayList<Usuario> lista = new ArrayList<>();
		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia")); // indice 4
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(4).nome); // Acessando o index da lista de numero 3 e imprimindo o nome atraves do .(ponto)
		lista.remove(2); // Removendo o primeiro valor de lia que está no indice 2
		lista.remove(new Usuario("Carlos")); // Removendo atraves do valor
		System.out.println(lista.contains(new Usuario("Manu"))); // Verificando se o nome Manu contem na lista

		System.out.println();
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}

	}
}
