package ejercicios4;

import java.util.Scanner;

public class Array5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = new int[5];

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el primer n�mero:");
		array1[0] = entrada.nextInt();

		System.out.println("Escribe el segundo n�mero:");
		array1[1] = entrada.nextInt();

		System.out.println("Escribe el tercer n�mero:");
		array1[2] = entrada.nextInt();

		System.out.println("Escribe el cuarto n�mero:");
		array1[3] = entrada.nextInt();

		System.out.println("Escribe el quinto n�mero:");
		array1[4] = entrada.nextInt();

		int numero = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (numero < array1[i]) {
				numero = array1[i];
				if (i == array1.length - 1) {
					System.out.println("Los n�meros est�n ordenados de forma creciente.");
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
					System.out.println("Los n�meros est�n ordenados de forma decreciente.");
					return;
				}
			} else {
				break;
			}
		}

		System.out.println("Los n�meros est�n desordenados.");
		entrada.close();

	}

}
