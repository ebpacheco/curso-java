package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursoJava-jpa");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);

		List<Usuario> usuarios = query.getResultList();

		// Jeito de escrever as funcionalidades de cima (linha 18 ate 22)em pouco
		// codigo, deixando encadeado
//		List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u", Usuario.class).setMaxResults(5)
//				.getResultList();

		for (Usuario usuario : usuarios) {
			System.out.println("ID: " + usuario.getId() + " E-mail: " + usuario.getEmail());
		}

		em.clear();
		emf.close();
	}
}
