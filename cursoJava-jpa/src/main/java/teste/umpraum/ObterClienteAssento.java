package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {

		// Como nesse caso é uma relacao bidirecional, podemos obter o assento a partir
		// do cliente
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();

		// Como nesse caso é uma relacao bidirecional, podemos obter o cliente a partir
		// do assento
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(1L);
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();

	}
}
