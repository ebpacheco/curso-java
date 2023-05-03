package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursoJava-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 6L);
		em.detach(usuario); // Esse comando responsavel por tirar o objeto (usuario) do estado gerenciado.
							// (sem ele nao precisaria do merge)
		usuario.setNome("Babi");

		em.merge(usuario); // Esse comando altera e persiste.
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
