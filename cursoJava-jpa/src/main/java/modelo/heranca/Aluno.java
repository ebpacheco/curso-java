package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

//Nesse cenario a heranca ira criar uma tabela por classe no banco de dados
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //Pior estrategia

//Nesse cenario a heranca ira criar uma unica tabela(tipo) para as duas classes com um valor de discriminacao
//A coluna ira ser de tamanho 2, vai receber uma string e o valor AL significa que é Aluno normal.
//Na classe AlunoBolsista sera definido o valor de AB
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("AL")

//Nesse cenario a heranca ira criar duas tabela(tipo) para as duas classes com um valor de discriminacao na tabela de aluno
//A coluna do joined ira ser de tamanho 2, vai receber uma string e o valor AL significa que é Aluno normal.
//Na classe AlunoBolsista sera definido o valor de AB
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
public class Aluno {

	@Id
	private Long matricula;
	private String nome;

	public Aluno() {
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
