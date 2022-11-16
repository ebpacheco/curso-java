package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void TestarSeIgualADois() {
		int a = 1 + 1;
		assertEquals(2, a);
//		fail("Not yet implemented");
	}

	// Se nao usar a anotacao @Teste nao funciona
//	@Test
	void TestarSeIgualATres() {
		int b = 2 + 10 - 9;
		assertEquals(3, b);
	}

}
