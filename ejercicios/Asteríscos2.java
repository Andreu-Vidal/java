package ejercicios;

import java.util.Scanner;

public class Asteríscos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		String frase;
		frase =entrada.nextLine();
		
		int longitud = frase.length();
		
		System.out.println("La cadena mide " + longitud);
		for (int i=0; i < longitud; i++) {
			System.out.print("*");
		}
						

	}

}
