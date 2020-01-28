package fundamentos;

public class DesafioOperadorAritmetico {

	public static void main(String[] args) {
		
		double num1 = 1;
		double num2 = 2;
		double num3 = 3;
		double num5 = 5;
		double num6 = 6;
		double num7 = 7;
		double num10 = 10;
		
		double numA;
		double denA;
		double supA;
		double numB;
		double supB;
		double superior;
		double inferior;
		double resultado;
		
		numA = Math.pow((num6 * (num3 + num2)), num2);
		denA = num3 * num2;
		supA = numA / denA;
		
		numB = (num1 - num5) * (num2 - num7);
		supB = Math.pow((numB / 2), num2);
		
		superior = Math.pow((supA - supB), num3);
		
		inferior = Math.pow(num10, num3);
		
		resultado = superior / inferior;
		
		System.out.println("Resultado " + resultado);
	}

}
