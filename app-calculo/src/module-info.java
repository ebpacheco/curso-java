module app.calculo {

	requires transitive app.logging; // transitive quer dizer que aquilo que vc recebeu de outro modulo (nesse caso o
										// logging vai estar disponivel para o outro modulo que esta acessando esse)

	exports br.com.cod3r.app.calculo;

	exports br.com.cod3r.app.calculo.interno to app.financeiro; // to representa que sera exportado apenas para um
																// modulo especifico, nesse caso o financeiro

	opens br.com.cod3r.app.calculo to app.financeiro; // Abre o modulo calculo para o modulo financeiro, nesse cenario o
														// modulo financeiro pode ate alterar um valor privado com o
														// reflection

	requires app.api;

//	provides Calculadora with CalculadoraImpl; //Mesma implementacao da linha debaixo
	provides br.com.cod3r.app.Calculadora with br.com.cod3r.app.calculo.CalculadoraImpl;
}