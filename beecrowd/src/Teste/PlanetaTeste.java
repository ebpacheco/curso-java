package Teste;

public class PlanetaTeste {

	EnumPlanetas planeta;

	public PlanetaTeste(String planeta) {
		this.planeta = EnumPlanetas.valueOf(planeta);
	}

	public void viajar() {

		switch (planeta) {
		case TERRA:
			System.out.println("Ja estamos aqui!");
			break;
		case MARTE:
			System.out.println("Muito quente!");
			break;
		case PLUTAO:
			System.out.println("Muito frio!");
			break;
		default:
			System.out.println("Passagem esgotada");
		}
	}
}
