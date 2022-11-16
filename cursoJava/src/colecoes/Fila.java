package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> Adicionam elementos na lista
		// Diferenca é o comportamento ocorre quando a fila está cheia
		fila.add("Ana"); // Add retorna null
		fila.offer("Bia"); // Offer retorna excecao (erro)
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		for (String f : fila) {
			System.out.println(f);
		}// Como é uma fila, o primeiro a entrada vai ser o primeiro a sair
		System.out.println();

		// Peek e Element -> obter o proximo elemento da fila (sem remover)
		// Diferenca é o comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek()); // Peek retorna null
		System.out.println(fila.element()); // Element retorna excecao (erro)
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println();
		// Poll e Remove -> obter o proximo elementos na lista e remove
		// Diferenca é o comportamento ocorre quando a fila está vazia

		System.out.println(fila.poll()); // Poll retorna null
		System.out.println(fila.remove()); // Remove retorna excecao (erro)
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		// System.out.println(fila.poll()); Null
		// System.out.println(fila.remove()); Erro

		// fila.size();
		// fila.isEmpty();
		// fila.clear();
		// fila.contains(...);

	}
}
