package classe;

public class DesafioFinalPessoa {
	
	String nome;
	double peso;
	
	DesafioFinalPessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(DesafioFinalComida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}
	
}