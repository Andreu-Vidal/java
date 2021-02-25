package ejercicios;

public class OrdenarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 7, 4, 31, 3, 77 };

		int aux;
		// ordenar el array

		for (int i = 0; i < array1.length - 1; i++) {
			for (int x = i + 1; x < array1.length; x++) {
				if (array1[x] > array1[i]) {
					aux = array1[i];
					array1[i] = array1[x];
					array1[x] = aux;
				}
			}
		}

		// Pintar el array
		for (int posicion = 0; posicion < array1.length; posicion++) {
			System.out.print(array1[posicion] + "-");
			
			//Revisar vídeo si no me queda claro
		}
	}

}
