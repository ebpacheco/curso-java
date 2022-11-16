package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc ac = new AreaCirc(10);

		// acessando a area como se fosse um metodo de instancia
		System.out.println(ac.area());

		// Metodo pertence a classe, nao precisa se instanciado
		System.out.println(AreaCirc.area(100));

		// Acessando o valor de PI direto na classe, sem precisar instanciar
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
