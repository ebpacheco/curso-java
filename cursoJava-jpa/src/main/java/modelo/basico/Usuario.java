package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Entidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Usando strategy, o BD nao gera a tabela hibernate_sequence pq
														// ele vai criar um auto incremento unico para esse atributo
	private Long id;

	private String nome;

	private String email;

	public Usuario() {

	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
