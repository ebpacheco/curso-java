package lambdas;

public class Multiplicar implements Calculo {

	@Override
	public double executar(double x, double y) {
		return x * y;
	}

}
