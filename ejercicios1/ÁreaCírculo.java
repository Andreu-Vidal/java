package ejercicios1;

import java.util.Scanner;

public class �reaC�rculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		// Int es para enteros, sin decimales. Con decimales es double. Preguntar por
		// float

		double radio = entrada.nextDouble();
		System.out.println("El �rea del c�rculo es: " + 3.141592 * (radio * radio));
		entrada.close();
	}

}
