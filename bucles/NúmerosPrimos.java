package bucles;

import java.util.Scanner;

public class NúmerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		boolean primo = true;

		int i = 2;

		System.out.println("Introduce un número: ");
		int n1 = scan.nextInt();

		if ((n1 != 0) && (n1 != 1)) {

			while ((i < n1) && (primo)) {

				if ((n1 % i) == 0) {
					primo = false;
				}

				++i;

			}
		}
		
		if(primo) {
			System.out.println(n1 + " Es primo");
			
		} else {
			System.out.println(n1 + " No es primo");
			
		}
		
		scan.close();

	}

}
