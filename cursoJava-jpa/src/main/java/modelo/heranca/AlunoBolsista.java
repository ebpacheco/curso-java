package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

	private double valorDaBolsa;

	public AlunoBolsista() {
	}

	public AlunoBolsista(Long matricula, String nome, double valorDaBolsa) {
		super(matricula, nome);
		this.valorDaBolsa = valorDaBolsa;
	}

	public double getValorDaBolsa() {
		return valorDaBolsa;
	}

	public void setValorDaBolsa(double valorDaBolsa) {
		this.valorDaBolsa = valorDaBolsa;
	}

}
