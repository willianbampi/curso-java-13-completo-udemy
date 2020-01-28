package oo.heranca;

public class Ferrari extends Carro {
	
	Ferrari(){
		this(300);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		super.delta = 15;
	}
	
}
