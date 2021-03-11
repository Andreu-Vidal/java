package graficos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//No se puede instanciar un objeto de loa clase Figura al ser abstracta
		// Figura fig1=new Figura();

		//Crear un objeto de tipo Rectñangulo
		Rectangulo rec1 = new Rectangulo(9, 8);
		System.out.println(rec1.area());
		rec1.pintar();
		System.out.println();
		System.out.println();
		
		//Crear un objeto de tipo Línea
		Linea lin1 = new Linea(7);
		System.out.println(lin1.area());
		lin1.pintar();
		System.out.println();
		System.out.println();
		
		//Crear un objeto de tipo Círculo
		Circulo c1=new Circulo(78);
		System.out.println(c1.area());
		c1.pintar();
		System.out.println();
		System.out.println();
	}

}
