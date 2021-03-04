package ejerciciosBuclesArrays;

import java.util.Scanner;

public class PedirNúmero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca un numero: ");
        Scanner entrada = new Scanner(System.in);
		
		int numero;
		numero=entrada.nextInt();
		
		for ( int i=100 ; i>=numero ;i -= 7)
		System.out.print(i + " ");
		
	}

}

