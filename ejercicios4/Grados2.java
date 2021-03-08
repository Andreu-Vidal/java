package ejercicios4;

public class Grados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temperatura=10;
		System.out.print(grados(temperatura));
	}

	public static double grados(double gradosf) {

		double gradosc = (gradosf - 32) * 5 / 9;

		return gradosc;

	}
}
