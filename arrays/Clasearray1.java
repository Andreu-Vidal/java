package arrays;

import java.util.Scanner;

public class Clasearray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[10];
		String[] frases = new String[5];

		Scanner pal = new Scanner(System.in);
		System.out.println("Dime una palabra");
		
		frases[0] = pal.nextLine();
		System.out.println("Dime una palabra");
		
		frases[1]  = pal.nextLine();
		System.out.println("Dime una palabra");
		
		frases[2]  = pal.nextLine();
		
		for (int cont=0; cont<=2; cont++) {System.out.print(frases[cont]);}
		
		
		//otra forma
		{System.out.println(frases[0]+ frases[1] + frases[2]);

	}

		
		
		
	}

}
