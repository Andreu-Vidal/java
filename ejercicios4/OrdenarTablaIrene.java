package ejercicios4;

public class OrdenarTablaIrene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tabla1 = new int[5];
		int[] tabla2 = new int[5];
		int[] tabla3 = new int[10];
		int aux;

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
		System.out.println("La tercera tabla sin ordenar es:");

		int contador = 0;

		for (int i = 0; i < tabla1.length; i++) {

			tabla3[contador] = tabla1[i];
			tabla3[contador + 1] = tabla2[i];
			contador = contador + 2;
		}

		for (int i = 0; i < tabla3.length; i++) {

			System.out.print(tabla3[i] + " ");
		}

		for (int i = 0; i < tabla3.length - 1; i++) {
			for (int x = i + 1; x < tabla3.length; x++) {
				if (tabla3[x] > tabla3[i]) {
					aux = tabla3[i];
					tabla3[i] = tabla3[x];
					tabla3[x] = aux;
				}
			}
		}

		System.out.println();
		System.out.println("La tercera tabla ordenada es:");

		for (int i = 0; i < tabla3.length; i++) {
			System.out.print(tabla3[i] + " ");

		}

	}
}
