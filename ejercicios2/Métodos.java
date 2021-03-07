package ejercicios2;

public class Métodos {

	public static int NumMayor(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}

	}
	public double AreaRectangulo (double num1, double num2) {
		return num1*num2;	
	}
		
public double VolumenCilindro( int radio , int longitud ) {
		
		double vol=0;
		
		vol=Math.PI*Math.pow(radio, 2)*longitud;
		return vol;

		
	}
	
}
