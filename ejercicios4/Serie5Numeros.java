package ejercicios4;

import java.util.Scanner;

public class Serie5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir por teclado una serie de 5 n�meros enteros y ponerlos en un array.
		// La aplicaci�n debe indicarnos si los n�meros est�n ordenados de forma
		// creciente, decreciente, o si est�n desordenados.

		Scanner entrada = new Scanner(System.in);

		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		int num5 = entrada.nextInt();

		int array1[] = { num1, num2, num3, num4, num5 };

		if (array1[0] <= array1[1] && array1[0] <= array1[2] && array1[0] <= array1[3] && array1[0] <= array1[4]
				&& array1[1] <= array1[2] && array1[1] <= array1[3] && array1[1] <= array1[4] && array1[2] <= array1[3]
				&& array1[2] <= array1[4] && array1[3] <= array1[4]) {
			System.out.println("Est� ordenador de forma creciente");

		} else if (array1[0] >= array1[1] && array1[0] >= array1[2] && array1[0] >= array1[3] && array1[0] >= array1[4]
				&& array1[1] >= array1[2] && array1[1] >= array1[3] && array1[1] >= array1[4] && array1[2] >= array1[3]
				&& array1[2] >= array1[4] && array1[3] >= array1[4]) {
			System.out.println("Est� ordenador de forma decreciente");
		} else {
			System.out.println("Est� desordenador");
		}

	}

}
