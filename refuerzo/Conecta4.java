package refuerzo;

public class Conecta4 {

	private static final int COL_LENGTH = 8;
	private static final int ROW_LENGTH = 8;

	public static void main(String[] args) {

		// o vacío
		// x ocupado
		String[][] tablero = new String[ROW_LENGTH][COL_LENGTH];

		// inicializar
		for (int i = 0; i < ROW_LENGTH; i++) {
			for (int j = 0; j < COL_LENGTH; j++) {
				tablero[i][j] = "o";
			}
		}

		pintarTablero(tablero);

		// Ejercicio 1:
		// insertar una moneda en una columna
		// Solicitar la columna
		// recorrer tablero para ver en qué fila "cae" la moneda

		// Ejercicio 2:
		// Comprobar si hay 4 iguales seguidas
		// en diagonal
		// en vertical
		// en horizontal

		pintarTablero(tablero);
	}

	private static void pintarTablero(String[][] tablero) {
		// pintar tablero
		for (int i = 0; i < ROW_LENGTH; i++) {

			for (int j = 0; j < COL_LENGTH; j++) {
				if (j == 0)
					System.out.print((i + 1) + " | ");

				System.out.print(tablero[i][j] + " ");

				if (j == (COL_LENGTH - 1))
					System.out.print(" | " + (i + 1));

			}

			System.out.println();

			if (i == ROW_LENGTH - 1) {
				System.out.print("   -");
				for (int k = 0; k < COL_LENGTH; k++) {
					System.out.print("--");
				}
				System.out.println();

				System.out.print("    ");
				for (int k = 0; k < COL_LENGTH; k++) {
					System.out.print("" + (k + 1) + " ");
				}
				System.out.println();
			}
		}
	}
}
