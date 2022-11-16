package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {

		// System.out.println(segredo); // private
		// System.out.println(facoDentroDeCasa); // default ou package
		System.out.println(formaDeFalar); // protected
		System.out.println(todosSabem); // public
	}
}
