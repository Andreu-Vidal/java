package ejercicios2;

public class DosTablas {

	public void dostablas() {

		int[] tabla1 = new int[10];
		int[] tabla2 = new int[10];

		System.out.println("La primera tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla1[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla1[i] + " ");
		}
		System.out.println();
		System.out.println("La segunda tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla2[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla2[i] + " ");
		}
		System.out.println();
		System.out.println("La tercera tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			System.out.print(tabla1[i] + " " + tabla2[i] + " ");
		}
	}

}
