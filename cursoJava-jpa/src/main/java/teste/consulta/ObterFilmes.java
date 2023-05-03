package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class ObterFilmes {

	public static void main(String[] args) {

		DAO<Filme> dao = new DAO<Filme>(Filme.class);
		// no dao.consultar passsamos 2 parametros, o primeiro é o nome da named-query e
		// o segundo do parametro que esta definido depois dos dois pontos (:) no XML
		// consultas. E logo apos o parametro passamos o valor que queremos obter. Como
		// no XML esta definido: "WHERE f.nota > :nota" Entao o parametro nota vai
		// corresponder a 8.5, sendo assim, ira trazer os filmes maiores que 8.5
		List<Filme> filmes = dao.consultar("obterFilmesNotaMaiorQue", "nota", 8.5);

		for (Filme filme : filmes) {
			System.out.println(filme.getNome() + " => " + filme.getNota());
			for (Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
			System.out.println();
		}
	}
}
