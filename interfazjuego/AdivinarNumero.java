package interfazjuego;

import java.util.Scanner;

public class AdivinarNumero implements Juego, Ficheros {

	private int numero = 0;
	private int num_tiradas = 0;

	public void iniciar() {
		this.setNumero((int) (Math.random() * 100) + 1);

	}

	public void jugar() {
		int n1 = 0;
		Scanner teclado = new Scanner(System.in);
		do {

			num_tiradas = num_tiradas + 1;
			System.out.println("Introduce el número: ");
			n1 = teclado.nextInt();
			if (numero > 1) {
				System.out.println("El número que buscas es mayor");
			} else if (numero < n1)

			{
				System.out.println("El número que bsucas es menor");
			} else

			{
				System.out.println("Lo encontraste");
			}

		} while (n1 != numero);

	}

	public void terminar() {

		System.out.println("Encontraste el numero " + numero + " despues de " + num_tiradas + " tiradas");

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNum_tiradas() {
		return num_tiradas;
	}

	public void setNum_tiradas(int num_tiradas) {
		this.num_tiradas = num_tiradas;
	}

	
	public void escribirResultado() {
		System.out.println("El resultado es: ");		
		
	}

}
