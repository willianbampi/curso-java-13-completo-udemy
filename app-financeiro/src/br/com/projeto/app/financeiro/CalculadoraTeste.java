package br.com.projeto.app.financeiro;

import java.lang.reflect.Field;

import br.com.projeto.app.calculo.Calculadora;
import br.com.projeto.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		//atraves do export
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3,4 ));
		
		//atraves do exports ... to
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 6));
		
		//reflection para acessar/alterar atributos privados de uma classe mesmo nao tendo os metodos getters e setters, 
		//no caso pode ser usado com modulos tmb, para isso é necessario declarar o open no pacote ou o opens no modulo
		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0];
		    fieldId.setAccessible(true);
			System.out.println(fieldId.get(calc));
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			fieldId.setAccessible(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
