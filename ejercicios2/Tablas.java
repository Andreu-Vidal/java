package ejercicios2;

public class Tablas {

	public String Saludar(String nombre) {
		return "Hola, te llamas " + nombre;
	}

	public void media() {

		double array1[] = new double[5];

		for (int i = 0; i < array1.length; i++) {

			// Meter número entre -50 y +50
			array1[i] = (Math.random() * -100) + 50;
			System.out.print(array1[i] + " ");
		}
		// Comprobamos par/impar/Cero
		int ceros = 0, positivos = 0, negativos = 0;
		double sum_positivos = 0, sum_negativos = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				ceros ++;

			} else if (array1[i] > 0) {
				sum_positivos = sum_positivos + array1[i];
				//Estar atento a los contadores
				positivos ++;
			} else {
				sum_negativos = sum_negativos + array1[i];
				negativos ++;
			}
		}
		//operador ternario --> (cond)?verdadero:falso. Si inicializamos con 1 en lugar de 0 
		System.out.println("\nLa media de los positivos es " + (sum_positivos / ((positivos==0)?1:positivos)) + " y la de los negativos es "
				+ (sum_negativos /((negativos==0)?1:negativos)));
		System.out.println("Y el número de ceros es " + ceros);
	}
	
	
	//ejercicio similar al de Dos Tablas pero con tres. Revisar
	public void concatenarTablas() {

		int[] tabla1 = new int[10];
		int[] tabla2 = new int[10];
		int[] tabla3 = new int[20];

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
		
        int posicion_tabla3=0;
		
        for (int i = 0; i < tabla1.length; i++) {
			tabla3[posicion_tabla3]=tabla1[i];
			tabla3[posicion_tabla3+1]=tabla2[i];
			posicion_tabla3=posicion_tabla3+2;
			//System.out.print(tabla1[i] + " " + tabla2[i] + " ");
		}
        for (int i = 0; i < tabla3.length; i++) {
        	System.out.print(tabla3[i] + " ");
		}
	}

}
