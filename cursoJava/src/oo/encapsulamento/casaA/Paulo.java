package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {

		// System.out.println(esposa.segredo); // private
		System.out.println(esposa.facoDentroDeCasa); // default ou package
		System.out.println(esposa.formaDeFalar); // protected
		System.out.println(esposa.todosSabem); // public
	}
}
