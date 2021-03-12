package excepciones;

public class PosicionArrayIncorrecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = { 2, 4, 1, 6 };

		try {
			System.out.println(array1[2]);
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException mi_error) {
			System.out.println("Ma parece que no existe esa posicion");
		} catch (ArithmeticException e1) {
			System.out.println("Has dividido por CERO");
		}

	}

}
