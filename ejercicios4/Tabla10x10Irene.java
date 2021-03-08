package ejercicios4;

public class Tabla10x10Irene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabla = new int[10][10];

		System.out.println("La tabla es:");

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = (int) (Math.random() * 9) + 1;
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int sumfila = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				sumfila = sumfila + tabla[i][j];
			}
			System.out.println("La suma de la fila " + (i + 1) + " es: " + sumfila);
			sumfila = 0;
		}
		System.out.println();

		int sumcolumna = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				sumcolumna = sumcolumna + tabla[j][i];
			}
			System.out.println("La suma de la columna " + (i + 1) + " es: " + sumcolumna);
			sumcolumna = 0;
		}
		System.out.println();

	}

}
