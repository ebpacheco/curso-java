package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		livros.add("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		for (String livro : livros) {
			System.out.println(livro);
		} // Como é uma pilha, o ultimo a entrada vai ser o primeiro a sair
		System.out.println();

		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println();

		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());
//		System.out.println(livros.poll()); Null
//		System.out.println(livros.remove()); Erro
//		System.out.println(livros.pop()); Erro

//		livros.size();
//		livros.clear();
//		livros.contains(...);
//		livros.isEmpty();
	}
}
