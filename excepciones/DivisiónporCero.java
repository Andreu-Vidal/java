package excepciones;

public class DivisiónporCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int resultado = 0;

		try {
			resultado = x / 0;

		} catch (Exception e) {
			resultado = x / 1;
		}

		System.out.println("El resultado es: " + resultado);

	}

}
