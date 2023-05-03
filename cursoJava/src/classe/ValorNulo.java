package classe;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!!"));

		Data d1 = Math.random() > 0.5 ? null : new Data();

		if (d1 != null) {
			System.out.println(d1.obterDataFormatada());
		}

		String s2 = Math.random() > 0.5 ? null : "";

		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}
}
