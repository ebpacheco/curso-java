package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio1 {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro("Babi", 10.5, "Vira Lata", false);
		Cachorro c2 = new Cachorro("Rita", 30, "Husky", false);
		Cachorro c3 = new Cachorro("Kush", 28, "Pitbull", false);
		Cachorro c4 = new Cachorro("Marley", 4.5, "Apartamento", false);
		Cachorro c5 = new Cachorro("Nelsinho", 3.8, "Vira Lata", false);
		Cachorro c6 = new Cachorro("Nino", 18, "Vira Lata", false);

		List<Cachorro> cachorro = Arrays.asList(c1, c2, c3, c4, c5, c6);
		Predicate<Cachorro> raca = r -> r.raca == "Vira Lata";
		Predicate<Cachorro> peso = p -> p.peso <= 15;
		Function<Cachorro, String> disponivelDoacao = m -> "Cachorro disponivel: " + m.nome;
		Consumer<String> imprimir = i -> System.out.println(i);

		cachorro.stream().filter(raca).filter(peso).map(disponivelDoacao).forEach(imprimir);

//		List<Cachorro> cachorro = Arrays.asList(c1, c2, c3, c4, c5, c6);
//		for (Cachorro c : cachorro) {
//			if (c.raca == "Vira Lata" && c.peso <= 15) {
//				c.doacao = true;
//			}
//			System.out.println(c);
//		}

	}
}
