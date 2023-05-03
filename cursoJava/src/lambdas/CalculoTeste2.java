package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Eu não dependo da classe somar ou multiplicar para fazer essa funcao.
		Calculo calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.executar(3, 2));

		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(3, 2));

		System.out.println(calculo.legal()); // Por ser default é acessado atraves da variavel
		System.out.println(Calculo.muitoLegal()); // Por ser uma funcao static não precisa ser instanciado
	}
}
