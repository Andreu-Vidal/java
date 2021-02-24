package bucles;

import java.util.Scanner;

public class ComandoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);

		int n1;
		int n2;

		n1 = numero.nextInt();
		n2 = numero.nextInt();

		while (n1 <= n2) {
			System.out.print(n1 + " ");
			n1++;
			if (n1==12) break; //Break oara salida abrupta si se produce alguna condición, si ocurre algo extraño
		}
		System.out.println("Te has salido con un valor: " +n1);
		numero.close();
		
		//Número primo, aquel que sólo es divisible entre sí mismo y por 1 (una división exacta no es primo)
		//Pedir 2 números y pintar todos los números entre ellos. Hacer un break cuando uno sea primo.
		// 8 (1-8) 

	}

}
