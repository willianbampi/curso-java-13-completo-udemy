module app.calculo {
	
	exports br.com.projeto.app.calculo;//declara o export do modulo
	
	//declara a depencia de uso do modulo aap.loggin e passa a depencia para quem depende de app.calculo,
	//porem quem depende de app.calculo precisa adicionar no buid path o modulo logging
	requires transitive app.logging;
	
	//declara a possibilidade de o modulo app.financeiro acessar o pacote interno de calculo
	exports br.com.projeto.app.calculo.interno to app.financeiro; //sepera por virgula os demais pacotes no mesmo exports
	
	//para possibilitar o uso de reflection com modulo é necessario declarar o modulo como open ou os pacotes como opens
	opens br.com.projeto.app.calculo;
	
	//é possivel usar o opens ... to
	opens br.com.projeto.app.calculo.interno to app.financeiro;
	
	requires app.api;
	provides br.com.projeto.app.api.Calculadora with br.com.projeto.app.calculo.CalculadoraImpl;
	
}