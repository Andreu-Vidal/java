package ejerciciosBuclesArrays;

import java.util.Scanner;

public class ContarN�meros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
		// han introducido.

		int contador = 0;
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        while(n1  >= 0) {
            System.out.println("Introduce un numero: ");
            n1 = scan.nextInt();

            if (n1 >= 0) {
                ++contador;
            }
        }
        System.out.println("Se han introducido " + contador + " numeros");
        scan.close();
	}
}
