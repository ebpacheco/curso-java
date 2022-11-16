package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		// Atribuicao por valor cria uma copia do valor na memoria, ja o atribuicao por
		// referencia aponta para o mesmo endereco de memoria.

		double a = 2;
		double b = a; // Atribuicao por valor (Tipo primitivo)

		a++;
		b--;

		System.out.println(a);
		System.out.println(b);

		Data d1 = new Data();
		Data d2 = d1; // Atribuicao por referencia (Objeto)

		d1.dia = 31;// Fazendo a alteracao direto na memoria, sendo assim, sera replicado para d2 tambem.				
		d2.mes = 12;// Fazendo a alteracao direto na memoria, sendo assim, sera replicado para d1 tambem.
				

		System.out.println(d1.obterDataFormatada()); // Imprimindo o valor que esta no endereco apontado para d1 e d2
		System.out.println(d2.obterDataFormatada()); // Imprimindo o valor que esta no endereco apontado para d1 e d2

		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada()); // Imprimindo o valor que esta no endereco apontado para d1 e d2 apos ser alterado apenas para d1
		System.out.println(d2.obterDataFormatada()); // Imprimindo o valor que esta no endereco apontado para d1 e d2 apos ser alterado apenas para d1 mas que reflete no d2.
		
		
		int c = 5;
		alterarPrimitio(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitio (int a) {
		a++;
	}
}
