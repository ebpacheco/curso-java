package classe; //Aula 116

public class DesafioJantar {
	public static void main(String[] args) {

		DesafioPessoa p1 = new DesafioPessoa("Eduardo", 99.8);

		DesafioComida c1 = new DesafioComida("Arroz", 0.180);
		DesafioComida c2 = new DesafioComida("Feijao", 0.300);
		DesafioComida c3 = new DesafioComida("Bife", 0.55);

//		System.out.println(p1.nome + " " + p1.peso);
		System.out.println(p1.apresentar());

		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);

//		System.out.printf(p1.nome + " " + "%.2f" , p1.peso);
		System.out.println(p1.apresentar());
	}
}
