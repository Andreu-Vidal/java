package ejercicios4;

public class Tabla10x10DiagonalInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[][] = new int[10][10];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) ((Math.random() * (10 - 1)) + 1);
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int sumaDiag1 = 0;
		int sumaDiag2 = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (i == j) {

					sumaDiag1 += tabla[i][j];

				}
				if (i + j == tabla.length - 1) {

					sumaDiag2 += tabla[i][j];

				}
			}

		}

		System.out.println("La suma de la diagonal principal es: " + sumaDiag1);

		System.out.println("La suma de la diagonal inversa es: " + sumaDiag2);

		/*
		 * si la suma de los indices, es igual matriz.length - 1, estas en la diagonal
		 * inversa es decir, para la primera fila i = 0, y j = 9 9+0 = 9, y array.length
		 * da 10, menos 1 da 9...por tanto estas en el primer elemento de la diagonal
		 * inversa y asi con las demas
		 */

	}
}
