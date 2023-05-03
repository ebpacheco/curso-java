package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	// Essa anotacao quer dizer que foi feito uma relacao bidirecional no java
	// (mapeando o nome do atributo que esta na classe cliente). Pois
	// nao fazemos relacoes bidirecionais no BD pois margem pra erro e
	// inconsistência.
	// "assento" é o nome da variavel, na classe assento, que foi feito essa
	// OneToOne
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;

	public Assento() {
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
