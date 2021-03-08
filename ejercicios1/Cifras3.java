package ejercicios1;

import java.util.Scanner;

public class Cifras3 {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Dime un número:");
	String n1 = scan.next();

	System.out.println("Este numero tiene " + n1.length() + " cifras");

	scan.close();


	}

}