package ejercicios2;

public class Tablas {

	public String Saludar(String nombre) {
		return "Hola, te llamas " + nombre;
	}

	public void media() {
		
		double array1[]=new double[5];
		
		for (int i=0; i<array1.length;i++) {
		
			array1[i]=Math.random()*100;
		}
	}

}
