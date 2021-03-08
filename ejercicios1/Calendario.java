package ejercicios1;

import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
		// Suponiendo todos los meses de 30 días.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dia");
		int dia = entrada.nextInt();
		System.out.println("Mes");
		int mes = entrada.nextInt();
		System.out.println("A�o");
		int anio = entrada.nextInt();

		// Meses con 30
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			System.out.println("Mes Incorrecto");
		{
			if (dia < 1 || dia > 30)
				System.out.println("Dia Incorrecto");
		}
		// if ( (dia<1 || dia>30) || (mes<1 || mes>12)) System.out.println("Fecha
		// incorrecta");
		// Comprobar lo mismo, pero los días del mes correctos, es decir Febrero 28,
		// Enero 31, etc...

		// Meses con 31
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			System.out.println("Mes Incorrecto");
		{
			if (dia < 1 || dia > 31)
				System.out.println("Dia Incorrecto");
		}

		// Febrero
		if (mes == 2)
			System.out.println("Mes Incorrecto");
		{
			if (dia < 1 || dia > 28)
				System.out.println("Dia Incorrecto");
		}

	}

}
