package ejerciciosBuclesArrays;

public class ContarParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solución Francis con su propio método
		generarCien();
	}

	public static void generarCien() {

		int numero = 0;
		int pares = 0;
		int impares = 0;
		int ceros = 0;
		int mediaPares = 0;
		int mediaImpares = 0;

		for (int i = 0; i <= 100; i++) {

			numero = (int) (Math.random() * 10 + 1);
			if (numero % 2 == 0) {

				// Suma de pares
				pares = pares + numero;
				// Numero de pares
				mediaPares++;
				if (numero == 0) {

					ceros++;
				}

			} else if (numero % 2 != 0) {

				// Suma de impares
				impares = impares + numero;
				// Contador impares
				mediaImpares++;

			}

		}

		System.out.println("La suma de los pares es: " + pares);
		System.out.println("La suma de los impares es: " + impares);
		System.out.println("La media de los pares es: " + (pares / mediaPares));
		System.out.println("La media de impares es: " + (impares / mediaImpares));
		System.out.println("Los ceros son: " + ceros);

	}

}
