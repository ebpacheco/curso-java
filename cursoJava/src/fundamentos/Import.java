package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		String a = "Bom dia!";
		System.out.println(a);
		
		//O pacote java.lang ja esta padronizado e incluido em todas as classes do java, sendo assim nao precisa importar.
		java.lang.String b = "Boa tarde!";
		java.lang.System.out.println(b);
		
		//Pra usar o Date eu preciso importar, nesse caso é o java.util.date.
		Date d = new Date();
		System.out.println(d);
	}
}
