package oo.heranca;

public class Civic extends Carro {
	
	Civic(){
		this(200);
	}
	
	Civic(int velocidadeMaxima){
		super(velocidadeMaxima);
		super.delta = 5;
	}
	
}
