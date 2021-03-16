package refuerzo;

public class Ejer3 {

	private static final int ROW_LENGTH = 8;
	private static final int COL_LENGTH = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] tablero = new String[ROW_LENGTH][COL_LENGTH];

		// inicializar
		for (int i = 0; i < ROW_LENGTH; i++) {
			for (int j = 0; j < COL_LENGTH; j++) {
				tablero[i][j] = "o";
			}
		}

		// pintar tablero
		for (int i = 0; i < ROW_LENGTH; i++) {

			for (int j = 0; j < COL_LENGTH; j++) {

				if (j == 0)
					System.out.print(i + 1 + " | ");

				System.out.print(tablero[i][j] + " ");
				if (j == (COL_LENGTH) - 1)
					System.out.print(" | " + (i + 1));

			}
			System.out.println("");

			if (i == ROW_LENGTH - 1) {
				System.out.print("   --");

				for (int k = 0; k < COL_LENGTH; k++) {
					System.out.print("--");

				}
				System.out.println();

				System.out.print("    ");
				for (int k = 0; k < COL_LENGTH; k++) {
					System.out.print("" + (k + 1) + " ");
				}

			}

		}

	}

}
