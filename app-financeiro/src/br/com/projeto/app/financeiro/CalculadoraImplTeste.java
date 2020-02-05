package br.com.projeto.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.projeto.app.api.Calculadora;;

public class CalculadoraImplTeste {

	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));
		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
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
