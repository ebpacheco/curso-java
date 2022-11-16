package classe;

public class DataTeste {

	public static void main(String[] args) {


		Data d1 = new Data(18,10,1992);

		Data d2 = new Data();
		d2.dia = 03;
		d2.mes = 01;
		d2.ano = 1996;
		
		Data d3 = new Data();

//		System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
//		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);

		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
//		d1.imprimirDataFormatada();
//		d2.imprimirDataFormatada();
//		d3.imprimirDataFormatada();

	}
}
