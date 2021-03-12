package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerFicheroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nombre del fichero");
		String fichero = teclado.next();
		String linea;
		int contador = 0;

		// File. Abrir fichero para lectura
		try {
			FileWriter fw = new FileWriter(fichero);
			PrintWriter pw1 = new PrintWriter(fichero);

			boolean salir = true;

			do {
				System.out.println("Introduce una linea: ");
				linea = teclado.next();

				if (linea.equals("F")) {
					salir = false;
				} else if (linea.length() < 4) {
					// No lo guardo en el fichero
				} else {
					// EScribo en un fichero
					pw1.println(linea);
					contador = contador + 1;
				}

			} while (salir);

		} catch (IOException e) {

			System.out.println("No puedo abrir el fichero para escribir, intentalo de nuevo");
		}
		
		System.out.println("\n Fichero cerrado");
		System.out.println("Has grabado" + contador + " linea.");

	}

}
