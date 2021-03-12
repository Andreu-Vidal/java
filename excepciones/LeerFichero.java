package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero1 = new File("D:\\andre\\Documents\\Prueba.docx");

		try {
			// Abro el fichero para leer
			FileReader fr = new FileReader(fichero1);

			// Buffer para ir cargando las líneas del fichero
			BufferedReader br = new BufferedReader(fr);

			String linea;
			
			//Leer una línea del fichero
			//Si liena==nuñll he llegado al final del fichero
			linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("He abierto el fichero");

	}

}
