package ejerciciosBuclesArrays;

import java.util.Scanner;

public class AdivinarNúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;
		int x = (int) ((Math.random() * 100-1)+1);
		boolean check = false;

		while (!check) { // Esto significa While check es falso
			// Pedir el número
			System.out.print("Número: ");
			num = sc.nextInt();
			if (x != num) {
				if (num < x) {
					System.out.println("Más");
				} else {
					System.out.println("Menos");
				}
			} else {
				System.out.println("Acertaste!!");
				System.out.println("El número era el " + x);
				check = true;
			}
		}
		sc.close();

	}

}
