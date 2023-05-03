package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioProfessor {

	public static void main(String[] args) {

		Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
		Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
		Produto p3 = new Produto("Caderno", 30, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200, 0.45, 0);
		Produto p5 = new Produto("Ipad", 3100, 0.29, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800, 0.31, 0);

		List<Produto> lista = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		Predicate<Produto> superPromocao = d -> d.desconto >= 0.30;
		Predicate<Produto> freteGratis = f -> f.frete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		Function<Produto, String> fraseFinal = m -> "Aproveite: " + m.nome + " por R$" + (m.preco * (1 - m.desconto));
		Consumer<String> imprimir = i -> System.out.println(i);

		lista.stream().filter(superPromocao).filter(freteGratis).filter(precoRelevante).map(fraseFinal)
				.forEach(imprimir);
		;
	}
}
