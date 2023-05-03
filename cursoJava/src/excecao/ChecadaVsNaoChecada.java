package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			gerarErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");
	}

	// Excecao NAO checada ou NAO verificada
	static void gerarErro1() {
		throw new RuntimeException("Gerou o erro #01");
	}

	// Excecao checada ou verificada
	static void gerarErro2() throws Exception {
		throw new Exception("Gerou o erro #02");
	}
}
