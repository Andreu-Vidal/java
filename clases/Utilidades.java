package clases;

public class Utilidades {

	// Librería de utilidades. Muy habitual en Java.

	public static boolean numeroPrimo(double n1) {
		if (n1 % 2 == 0) {
			return false;
		} else {
			int x = 2;
			while (x < n1) {
				if (n1 % x == 0) {
					return false;
				}
				x++;
			}
			return true;
		}
	}

	public static boolean parImpar(double n1) {
		if (n1 % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}