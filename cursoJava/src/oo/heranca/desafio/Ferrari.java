package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	boolean ligarTurbo = false;
	boolean ligarAr = false;

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
		// delta = 15;
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 40;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}

//	@Override
//	void acelerar() {
//
//		velocidadeAtual += 15;
//	}

//	@Override
//	public void acelerar() {
//		// TODO Auto-generated method stub
//		super.acelerar();
//		super.acelerar();
//		super.acelerar();
//	}
}