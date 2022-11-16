package lambdas;

//Essa anotacao diz que na interface só pode existir uma funcao abstrata
@FunctionalInterface
public interface Calculo {
	public abstract double executar(double x, double y);

// Mas aceita funcao como default e static
	default String legal() {
		return "Legal";
	}

	static String muitoLegal() {
		return "Muito Legal";
	}
}
