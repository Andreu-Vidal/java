package ejercicios1;

import java.util.Scanner;

public class M�ltiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.out.println("Dime un numero: ");
		Scanner entrada= new Scanner(System.in);
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		if (num1%num2==0 || num2%num1==0) //Si un n�mero dividido entre otro tiene como resto 0 es m�ltiplo
		{
			System.out.println("Son multiplos");
		} else
		{
			System.out.println("No son multiplos");

		}
		entrada.close();


	}

}
