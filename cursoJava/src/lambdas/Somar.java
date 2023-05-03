package lambdas;

public class Somar implements Calculo {

	@Override
	public double executar(double x, double y) {
		return x + y;
	}

}
