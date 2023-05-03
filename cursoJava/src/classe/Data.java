package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // Posso usar o this como construtor
	}

	Data(int dia, int mes, int anoInicial) {
		this.dia = dia; // This nesse casoo esta referenciando a variavel de instancia e recebendo oouma
						// variavel com o mesmo nome.
		this.mes = mes;
		this.ano = anoInicial; // E o this pode ser usado mesmo em cenario que o nome da variavel nao é a
								// mesma, o This vai referenciar a instacia.
	}

	String obterDataFormatada() {
		String formato = dia + "/" + mes + "/" + ano; // "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
//		return "\n"+dia + "/" + mes + "/" + ano;
	}

	// Nesse caso nao retorna um valor, nao é melhor praticar usar esse exemplo mas
	// serve pra mostrar que podemos chamar um metodo dentro de outro.
	void imprimirDataFormatada() {
//		System.out.printf("%d/%d/%d\n", dia, mes, ano);
		// Posso usar o this pra referenciar metodo de instancia
		System.out.println(this.obterDataFormatada());
	}
}