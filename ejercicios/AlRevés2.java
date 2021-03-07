package ejercicios;

public class AlRev�s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dos cadenas de enteros de 5 posiciones
		// Rellenamos una cadena con números
		// Pasamos los números de una cadena a otra dándoles la vuelta. Al reves
		// Es decir, cadena 1 tiene 1,2,3,4,5
		// la cadena 2 tiene que tener 5,4,3,2,1

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = new int[5];

		int longitud = array1.length - 1;
		// rellenar el array

		for (int x = longitud; x >= 0; x--) {
			array2[x] = array1[longitud - x];
		}

		// pintar Array

		for (int x = 0; x <= longitud; x++) {
			System.out.print("-" + array2[x]);
		}

	}
}
