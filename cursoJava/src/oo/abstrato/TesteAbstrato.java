package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {

//		Animal a = new Cachorro(); // Instanciar o cachorro a partir do tipo Animal seria possivel visualizar só os metodos definidos no animal (Respirar e Mover)
//		Mamifero a = new Cachorro(); // Instanciar o cachorro a partir do tipo Mamifero seria possivel visualizar os meotods dentro de Animal (pq Mamifero herda Animal) e os metodos dentro de mamifero
		Cachorro a = new Cachorro(); // Instanciar o cachorro a partir do tipo Cachorro é possivel visualizar todos	os metodos de todas herancas mais o Cachorro
		
		System.out.println(a.respirar());
		System.out.println(a.mover());
		System.out.println(a.mamar());
	}
}
