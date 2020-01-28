package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String valor1;
		String valor2;
		String valor3;
		double salario1;
		double salario2;
		double salario3;
		double media;
		
		System.out.println("Informe o primeiro salario:");
		valor1 = input.next().replace(",", ".");
		System.out.println("Informe o segundo salario:");
		valor2 = input.next().replace(",", ".");
		System.out.println("Informe o terceiro salario:");
		valor3 = input.next().replace(",", ".");
		
		salario1 = Double.parseDouble(valor1);
		salario2 = Double.parseDouble(valor2);
		salario3 = Double.parseDouble(valor3);
		
		media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A media dos salarios é: " + media);
		
		input.close();
	}

}
