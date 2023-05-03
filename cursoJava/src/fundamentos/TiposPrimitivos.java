package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informacoes do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23; //byte vai de -128 ate +127
		short numerosDeVoo = 542; //short vai ate -23768 ate +23767
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numericos reias
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//Usando as variaveis
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numerosDeVoo / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> "+ salario);
		
		System.out.println("Ferias ? - " + estaDeFerias);
		
		System.out.println("Status: "+ status);		
	}
}
