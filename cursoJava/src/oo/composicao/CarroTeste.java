package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();

		System.out.println(c1.motor.ligado);

		c1.ligar();
		System.out.println(c1.motor.ligado);

		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());

		c1.frear();
		System.out.println(c1.motor.giros());

//		Faltou encapsulamento!!
//		c1.motor.fatorInjecao = -30;
//		System.out.println(c1.motor.giros());

		// Relacao Bidirecional
		// nao é muito utilizado, por padrao usamos relacao Unidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());

	}
}
