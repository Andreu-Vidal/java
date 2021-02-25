package ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir por teclado 3 datos
		// 2 números
		// Una operación (+,*,-,/)
		// Switch
		// Cálculo + suma + resta
		// Comprobar que ponemos la operación
		// Bucle hasta que pulsemos una "F" en operación

		Scanner entrada = new Scanner(System.in);
		String operacion;


		do {
			operacion = entrada.next();
			if (operacion.equals("F")) {
				System.out.println("Fin de programa");
				break;
			} else if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("/")
					&& !operacion.equals("*")) {

				System.out.println("Operacion Incorrecta");
			} else {

				float num1 = entrada.nextFloat();
				float num2 = entrada.nextFloat();

				switch (operacion) {
				case "+":
					// resultado=num1+num2
					System.out.println("La suma es: " + (num1 + num2));
					break;

				case "-":
					System.out.println("La resta es: " + (num1 - num2));
					break;

				case "*":
					System.out.println("La multiplicación es: " + (num1 * num2));
					break;

				case "/":
					System.out.println("La división es: " + (num1 / num2));
					break;
				default:
					if (operacion != "+" && operacion != "-" && operacion != "*" && operacion != "/")
						System.out.println("Operación incorrecta");
				}
			}

		} while (!operacion.equals("F"));
		entrada.close();

	}
}
