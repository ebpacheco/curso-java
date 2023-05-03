package generics;

public class CaixaTeste {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// Quando o tipo nao é definido, o java assume por padrao o "Object"
		Caixa caixaA = new Caixa();
		caixaA.guardar("Olá");
		System.out.println(caixaA.abrir());

		// Aqui estamos trabalhando com o tipo String mas poderia ser definido outro
		// tipo... Igual o exemplo da caixaC
		Caixa<String> caixaB = new Caixa<>();
		caixaB.guardar("Tchau");
		System.out.println(caixaB.abrir());

		Caixa<Double> caixaC = new Caixa<>();
		caixaC.guardar(2.3);
		Double abrir = caixaC.abrir();
		System.out.println(abrir);

	}
}
