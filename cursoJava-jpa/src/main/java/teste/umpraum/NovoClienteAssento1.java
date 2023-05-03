package teste.umpraum;

import infra.DAO;
import modelo.basico.Entidade;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 implements Entidade {

	public static void main(String[] args) {

//		Assento assento = new Assento("16C");
//		Cliente cliente = new Cliente("Eduardo", assento); // Exemplo 1

//		Assento assento = new Assento("8C");
//		Cliente cliente = new Cliente("Natany", assento); // Exemplo 2

		Assento assento = new Assento("23F");
		Cliente cliente = new Cliente("Babi", assento); // Exemplo 3

		DAO<Object> dao = new DAO<>();

		// Primeiro incluindo o assento pois o cliente depende de uma coluna da tabela
		// de assentos, a FK da tabela cliente é "assento" e sendo assim precisa ser
		// carregada primeiro
		dao.abrirTransacao().incluir(assento).incluir(cliente).fecharTransacao().fechar(); // Exemplo 1

		// Primeiro incluindo o cliente e depois o assento, isso vai funcionar pq esta
		// na mesma transacao
//		dao.abrirTransacao().incluir(cliente).incluir(assento).fecharTransacao().fechar(); // Exemplo 2

		// Nesse caso estamos tentando criar as tabelas em diferentes transacoes.
		// Primeiro estamos tentando incluir a tabela cliente mas ela depende da coluna
		// que esta em assento. Sendo assim o sistema ira lancar uma excecao "references
		// an unsaved transient instance". O cenario correto seria o inverso, primeiro
		// inserir a tabela assento e depois inserir a tabela cliente
//		dao.abrirTransacao().incluir(cliente).fecharTransacao().fechar(); // Exemplo 3
//		dao.abrirTransacao().incluir(assento).fecharTransacao().fechar(); // Exemplo 3

	}
}
