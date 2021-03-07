package ejercicios;

import java.util.Scanner;

public class VocalesConMay�sculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un texto por pantalla
		// Pintar sólo las consonantes
		// Esto es una prueba --> st s n prb

		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		//Lo convertimos todo en minúsculas, aunque con toUpperCase se hace lo contrario
		String frase_minus=frase.toLowerCase();
		
		for (int posicion = 0; posicion < frase.length(); posicion++) {
			
			char letra=frase_minus.charAt(posicion);
			

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				continue;
			} else {
				System.out.print(letra);
			}
			entrada.close();
			

		}

	}

}
