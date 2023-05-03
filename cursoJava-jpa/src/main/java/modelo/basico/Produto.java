package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Cria o nome da tabela, e define qual schema sera utilizado
@Table(name = "produtos", schema = "curso_java")
public class Produto implements Entidade{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Nome da coluna, tamanho do campo de 200 caracteres, nao aceita valor null
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;

	// Nome da coluna, nao aceita valor null, tamanho do campo de 11 digitos,
	// e recebe "," ou "." (depende do formato) depois da segunda casa decimal
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;

	public Produto() {
		super();
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
