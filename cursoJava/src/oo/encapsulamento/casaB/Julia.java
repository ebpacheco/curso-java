package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {

		// System.out.println(sogra.segredo); // private
		// System.out.println(sogra.facoDentroDeCasa); // default ou package
		// System.out.println(sogra.formaDeFalar); // protected
		System.out.println(sogra.todosSabem); // public
	}

}
