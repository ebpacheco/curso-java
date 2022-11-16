package fundamentos;

public class Relacionais {

		public static void main(String[] args) {
			
			double nota = 7.7;
			
			boolean bomComportamento = true;
			boolean passouPorMedia = nota >= 7;
			boolean temDesconto = bomComportamento && passouPorMedia;
			
			System.out.println("Tem Desconto? "+ temDesconto);
			
		}
}
