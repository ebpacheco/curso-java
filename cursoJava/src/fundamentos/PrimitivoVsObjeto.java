package fundamentos;

public class PrimitivoVsObjeto {

		public static void main(String[] args) {
			//Tudo em JAVA é objeto menos os tipos primitivos
			//A partir dos objetos voce pode ter notacao poonto "."
			//diferente dos tipos primitivos que so carregam valores
			
			String s = new String ("Texto");
			s.toUpperCase();
			
			//Wrappers sao a versao objeto dos tips primitivos
			int a = 123;
			System.out.println(a);
		}
}
