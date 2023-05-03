package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("Senhor dos Aneis", 8.9);
		Filme filmeB = new Filme("Clube da Luta", 8.1);

		Ator atorA = new Ator("Eduardo");
		Ator atorB = new Ator("Natany");

		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);

		filmeB.adicionarAtor(atorA);

		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
	}

}
