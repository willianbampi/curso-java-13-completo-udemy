package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome da semana");
		
		String entrada = input.next();
		
		if("domingo".equalsIgnoreCase(entrada)) {
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(entrada)) {
			System.out.println(2);
		} else if ("terça".equalsIgnoreCase(entrada) || "terca".equalsIgnoreCase(entrada)) {
			System.out.println(3);
		} else if ("quarta".equalsIgnoreCase(entrada)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(entrada)) {
			System.out.println(5);
		} else if ("sexta".equalsIgnoreCase(entrada)) {
			System.out.println(6);
		} else if ("sábado".equalsIgnoreCase(entrada) || "sabado".equalsIgnoreCase(entrada)) {
			System.out.println(7);
		} else {
			System.out.println("Dia invalido");
		}
		
		input.close();
	}

}
