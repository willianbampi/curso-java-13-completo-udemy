package fundamentos;

public class Primitivos {

	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false;
		
		char status = 'A';
		
		System.out.println("dias de empresa " + anosDeEmpresa * 365);
		System.out.println("numero de viagens " + numeroDeVoos/2);
		System.out.println("pontos por real " + pontosAcumulados/vendasAcumuladas);
		System.out.println("id " + id + " ganha " + salario);
		System.out.println("ferias? " + estaDeFerias);
		System.out.println("status " + status);
	}

}
