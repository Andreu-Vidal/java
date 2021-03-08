package ejercicios4;

public class Tabla10x10Carlos {

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

		int sumaFila = 0;
		int sumaColumna = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				sumaColumna += tabla[j][i];
			}
			System.out.println("La suma de la fila " + i + " es: " + sumaFila);
			sumaFila = 0;
			System.out.println("La suma de la columna " + i + " es: " + sumaColumna);
			sumaColumna = 0;
		}

	}

}
