package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Eduardo", "Pacheco", 30);

		System.out.println(p1.getNomeCompleto()); // ler
		p1.setIdade(-29); // alterar
		System.out.println(p1); // toString
	}
}
