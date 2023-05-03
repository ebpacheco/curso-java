package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cursoJava-jpa");
		EntityManager em = emf.createEntityManager();

		// Usuario usuario = new Usuario("Eduardo", "eduardo@teste.com");
		// Usuario usuario = new Usuario("Natany", "natany@teste.com");
		// Usuario usuario = new Usuario("Rafaela", "rafaela@teste.com");
		// Usuario usuario = new Usuario("Silvia", "silvia@teste.com");
		// Usuario usuario = new Usuario("Dudao", "dudao@teste.com");
		// Usuario usuario = new Usuario("Babi", "babi@teste.com");
		Usuario usuario = new Usuario("teste", "teste@teste.com");

		// Foi ajustado no codigo para o Id ser gerado automaticamente atraves da
		// anotacao GeneratedValue
//		usuario.setId(1L);

		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
