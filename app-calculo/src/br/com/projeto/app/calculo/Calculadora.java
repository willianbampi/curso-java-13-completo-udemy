package br.com.projeto.app.calculo;

import br.com.projeto.app.calculo.interno.OperacoesAritmeticas;
import br.com.projeto.app.logging.Logger;

public class Calculadora {
	
	private String id = "abc";
	
	private OperacoesAritmeticas op = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando");
		return op.soma(nums);
	}

	public String getId() {
		return id;
	}
	
}
