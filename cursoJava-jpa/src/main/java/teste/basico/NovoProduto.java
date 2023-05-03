package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

//		Produto produto = new Produto("Caneta", 7.45); //Exemplo 1
//		Produto produto = new Produto("Notebook", 2987.78); //Exemplo 2
		Produto produto = new Produto("Monitor 23", 789.98); // Exemplo 3

		DAO<Produto> dao = new DAO<>(Produto.class);
//		dao.abrirTransacao().incluir(produto).fecharTransacao().fechar(); //Exemplo 1
		dao.incluirAtomico(produto).fechar(); // Exemplo 2 e 3

		System.out.println("ID do produto: " + produto.getId());
	}
}
