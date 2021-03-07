package arrays;

import java.util.Scanner;

public class TresenRayaAlberto {

	public static void main(String[] args) {
		// Crear un array de Strings de 3x3
		// Pedir por teclado dos posiciones (x,z) 1, 2
		// Poner en "X" en esa posici√≥n
		// Pintamos el bucle

		// Creo el tablero
		String tablero[][] = new String[3][3];

		// Lo relleno de "o"
		for (int z = 0; z < tablero.length; z++) {
			for (int h = 0; h < tablero[z].length; h++) {
				tablero[z][h] = "o";
			}
		}

		// Lo pinto para comprobar
		for (int z = 0; z < tablero.length; z++) {
			for (int h = 0; h < tablero[z].length; h++) {
				System.out.print(tablero[z][h]);
			}
			System.out.println();
		}

		Scanner entrada = new Scanner(System.in);
		int fila;
		int columna;

		// Pido una posiciÛn para pintar una x
		System.out.println("Fila:");
		fila = entrada.nextInt();
		System.out.println("Columna:");
		columna = entrada.nextInt();

		// Pongo una X en esa posiciÛn
		tablero[fila][columna] = "X";

		// Pinto de nuevo el array
		for (int z = 0; z < tablero.length; z++) {
			for (int h = 0; h < tablero[z].length; h++) {
				System.out.print(tablero[z][h]);
			}
			System.out.println();
		}

		entrada.close();
	}
}