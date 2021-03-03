package ejercicios1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		boolean menu = true;
		while (menu) {
			System.out.println("Dime una nota");
			int nota = scan.nextInt();

			switch (nota) {
			case -1:
				menu = false;
				break;
			case 0:
			case 1:
			case 2:
				System.out.println("Muy deficiente. ¡¡Vas a suspender!!");
				break;
			case 3:
			case 4:
				System.out.println("Insuficiente. ¡¡Estudia más!!");
				break;
			case 5:
				System.out.println("Suficiente. ¡¡Estudia más!!");
				break;
			case 6:
				System.out.println("¡Bien!");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("¡¡Sobresaliente!! Sigue así");
				break;

			default:
				System.out.println("Escribe un número correcto");
				break;

			}

		}

		System.out.println("Adiós!!!");
		scan.close();
	}
}