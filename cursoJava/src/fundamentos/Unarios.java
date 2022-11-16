package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		//Pre-Fixado
		a++; // a = a + 1;
		a--; // a = a - 1;

		//Pos-Fixado
		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); //Nessa linha o pos fixado sera executado na hora, e o pre sera executado so na proxima linha, sendo 2 == 2	
		System.out.println(a == b); // Logo aqui nao sera mais igual pq o b-- ja foi executado, sendo 2 ==1 		
		System.out.println(a);
		System.out.println(b);
	}
}
