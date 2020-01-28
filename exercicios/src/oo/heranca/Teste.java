package oo.heranca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Civic1");
		Carro civic1 = new Civic();
		System.out.println(civic1.toString());
		System.out.println("velocidade maxima: " + civic1.VELOCIDADE_MAXIMA);
		
		civic1.acelerar();
		System.out.println(civic1.toString());
		civic1.acelerar();
		System.out.println(civic1.toString());
		civic1.frear();
		System.out.println(civic1.toString());
		
		System.out.println("Civic2");
		Civic civic2 = new Civic(250);
		System.out.println(civic2.toString());
		System.out.println("velocidade maxima: " + civic2.VELOCIDADE_MAXIMA);
		
		civic2.acelerar();
		System.out.println(civic2.toString());
		civic2.acelerar();
		System.out.println(civic2.toString());
		civic2.frear();
		System.out.println(civic2.toString());
		
		System.out.println("\nFerrari1");
		Ferrari ferrari1 = new Ferrari();
		System.out.println(ferrari1.toString());
		System.out.println("velocidade maxima: " + ferrari1.VELOCIDADE_MAXIMA);
		
		ferrari1.acelerar();
		System.out.println(ferrari1.toString());
		ferrari1.acelerar();
		System.out.println(ferrari1.toString());
		ferrari1.frear();
		System.out.println(ferrari1.toString());
		
		System.out.println("\nFerrari2");
		Ferrari ferrari2 = new Ferrari(400);
		System.out.println(ferrari2.toString());
		System.out.println("velocidade maxima: " + ferrari2.VELOCIDADE_MAXIMA);
		
		ferrari2.acelerar();
		System.out.println(ferrari2.toString());
		ferrari2.acelerar();
		System.out.println(ferrari2.toString());
		ferrari2.frear();
		System.out.println(ferrari2.toString());
		
	}

}
