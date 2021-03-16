package refuerzo;

public class Ejer1 {

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
			 //System.out.print("comienzo i = "+i);
			for (int j = 0; j < COL_LENGTH; j++) {
				 //System.out.print(" j = "+j);
				System.out.print(tablero[i][j] + " ");
			}
			//System.out.print(" final i = "+i);
			System.out.println("");
		}

	}

}
