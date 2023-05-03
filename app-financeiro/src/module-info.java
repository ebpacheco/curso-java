module app.financeiro {

	requires java.base; // Por padrao o java ja exporta esse modulo implicitamente
//	requires app.calculo;
	requires app.api;

	uses br.com.cod3r.app.Calculadora;
}