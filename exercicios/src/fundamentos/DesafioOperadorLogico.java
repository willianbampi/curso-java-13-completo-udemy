package fundamentos;

public class DesafioOperadorLogico {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50\" ? " + tv50);
		
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 32\" ? " + tv32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Comprou sorvete? " + sorvete);

		boolean naoSorvete = !sorvete;
		System.out.println("Mais saudavel? " + naoSorvete);
	}

}
