package ejercicios4;

import java.util.Scanner;

public class Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void grados() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Escribe la temperatura en grados Fahrenheit:");
		double temperatura = scan.nextDouble();

		double grados = (temperatura - 32) * 5 / 9;

		System.out.print("La temperatura en grados Celsius es: " + grados + " ºC.");
		scan.close();
	}

}
