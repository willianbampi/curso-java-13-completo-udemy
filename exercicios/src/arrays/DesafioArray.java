package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas:");
		
		int quantidade = scanner.nextInt();
		
		double notas[] = new double[quantidade];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) +":");
			notas[i] = scanner.nextDouble();
		}
		
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		System.out.println("A media das notas é: " + total / notas.length);
		scanner.close();
		
	}

}
