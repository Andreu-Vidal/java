package ejercicios2;

import java.util.Scanner;

public class TablasMultidimensionales {

	public void multiDimension() {
		int[][] lista = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				lista[i][j] = i + j;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(lista[i][j]);
			}
			System.out.println("\n");
		}
	}

	public void diagonalesSiete() {

		// Declarar el array

		int[][] array = new int[7][7];

		// Rellenar el array

		for (int i = 0; i < array.length; i++) {

			System.out.println("");
			for (int x = 0; x < array.length; x++) {

				if (i == x) {

					array[i][x] = 1;
				} else {

					array[i][x] = 0;
				}
				System.out.print(array[i][x]);
			}
		}
	}

	public void matrices_2() {
		// Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la
		// diagonal
		// principal sean 1 y el resto 0.
		int T[][] = new int[7][7];

		// Relleno la tabla
		for (int n = 0; n < T.length; n++) {

			T[n][n] = 0;

		}

		// Muestra la tabla
		for (int z = 0; z < T.length; z++) {
			for (int h = 0; h < T[z].length; h++) {
				System.out.print(T[z][h]);
			}
			System.out.println();
		}
	}

	public void metodo3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce filas: ");
		final int FIL = sc.nextInt();
		System.out.print("Introduce columnas: ");
		final int COL = sc.nextInt();
		char[][] tabla = new char[FIL][COL];

		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				tabla[i][j] = '*';
//				System.out.print(tabla[i][j] + " ");
			}
//			System.out.println();
		}

		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void metodo3(int lado1, int lado2) {
		
		char[][] tabla = new char[lado1][lado2];

		for (int i = 0; i < lado1; i++) {
			for (int j = 0; j < lado2; j++) {
				tabla[i][j] = '*';
//				System.out.print(tabla[i][j] + " ");
			}
//			System.out.println();
		}

		for (int i = 0; i < lado1; i++) {
			for (int j = 0; j < lado2; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
}
	}
}
