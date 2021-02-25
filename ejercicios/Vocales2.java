package ejercicios;

import java.util.Scanner;

public class Vocales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un texto por pantalla
		// Pintar sólo las consonantes
		// Esto es una prueba --> st s n prb

		  Scanner input = new Scanner(System.in);
	        System.out.println("Introduce tu nombre: ");
	        String frase = input.nextLine();

	        for (int i = 0; i < frase.length(); i++) {
	            char letra = frase.charAt(i);
	            if ((letra != 'a') && (letra != 'e') && (letra != 'i') && (letra != 'o') && (letra != 'u')){
	                System.out.print(letra);
	            }
	        }

	        input.close();

	    }

	}
