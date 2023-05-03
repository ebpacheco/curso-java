package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursoJava-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 6L);

		usuario.setNome("Babi Dog");
		usuario.setEmail("babiDog@teste.com");
		// Merge responsavel por pegar um usuario que ja esta no BD e fazer a alteracao
		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
