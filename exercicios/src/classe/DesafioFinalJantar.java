package classe;

public class DesafioFinalJantar {

	public static void main(String[] args) {
		DesafioFinalComida c1 = new DesafioFinalComida("Arroz", 0.180);
		DesafioFinalComida c2 = new DesafioFinalComida("Feijao", 0.300);
		
		DesafioFinalPessoa p1 = new DesafioFinalPessoa("João", 99.8);
		System.out.println(p1.apresentar());

		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}

}
