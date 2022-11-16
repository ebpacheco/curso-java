package classe;

public class Equals {
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@zemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@zemail.com.br";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); // Sem o equals na classe usuario essa comparacao é igual u1 == u2
		System.out.println(u2.equals(u1)); // Sem o equals na classe usuario essa comparacao é igual u2 == u1

//		System.out.println(u2.equals(new Date()));  Tentando comparar uma data com uma classe de usuário, fizemos o
//													 instanceOf na classe usuario para evitar essa situacao
	}

}
