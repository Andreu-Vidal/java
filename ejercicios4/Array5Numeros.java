package ejercicios4;

import java.util.Scanner;

public class Array5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = new int[5];

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el primer número:");
		array1[0] = entrada.nextInt();

		System.out.println("Escribe el segundo número:");
		array1[1] = entrada.nextInt();

		System.out.println("Escribe el tercer número:");
		array1[2] = entrada.nextInt();

		System.out.println("Escribe el cuarto número:");
		array1[3] = entrada.nextInt();

		System.out.println("Escribe el quinto número:");
		array1[4] = entrada.nextInt();

		int numero = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (numero < array1[i]) {
				numero = array1[i];
				if (i == array1.length - 1) {
					System.out.println("Los números están ordenados de forma creciente.");
					return;
				}
			} else {
				break;
			}
		}

		numero = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (numero > array1[i]) {
				numero = array1[i];
				if (i == array1.length - 1) {
					System.out.println("Los números están ordenados de forma decreciente.");
					return;
				}
			} else {
				break;
			}
		}

		System.out.println("Los números están desordenados.");
		entrada.close();

	}

}
