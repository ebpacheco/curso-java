package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	protected String mover() {
		return "Usando as patas";
	}

	protected abstract String mamar();
}
