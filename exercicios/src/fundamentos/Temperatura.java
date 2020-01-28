package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final int VAL_ADJ = 32;
		final double VAL_FAT = 5.0/9.0;
		double tempF = 50;
		double tempC = (tempF-VAL_ADJ) * VAL_FAT;
		System.out.println("A temperatura " + tempF + "ºF representa " + tempC + "ºC");
	}
	
}
