module app.financeiro {
	
	requires java.base;//declara a dependecia de uso do modulo java.base
	requires app.calculo;//declara a depencia de uso do modulo app.calculo
	requires app.api;
	uses br.com.projeto.app.api.Calculadora;
	
}