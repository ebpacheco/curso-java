package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sai o Bassai-Dai");
		case "marrom":
			System.out.println("Sai o Tekki Shodan");
		case "roxa":
			System.out.println("Sai o Heian Godan");
		case "verde":
			System.out.println("Sai o Heian Yodan");
		case "laranja":
			System.out.println("Sai o Heian Sandan");
		case "vermelha":
			System.out.println("Sai o Heian Nidan");
		case "amarela":
			System.out.println("Sai o Heian Shodan");
			break;
		default:
			System.out.println("Nao sei de nada");
		}

		System.out.println("Fim\n");

		int idade = 3;

		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}

	}
}
