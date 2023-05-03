package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursoJava-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 6L);
		usuario.setNome("babi");
		usuario.setEmail("babiDog@teste.com");

//	 	em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
