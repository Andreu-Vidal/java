package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p1.mostrar();
		System.out.println(p1.saludar("hola"));
		p1.setNombre("Andreu");
		p2.setNombre("Rosa");

		p1.setSalario(10000);
		System.out.println(p1.getNombre() + " " + p2.getNombre());

		Vehículo v1 = new Vehículo();

		v1.setTipo(1);
		v1.setPvp(1000);
		System.out.println(v1.precio());

		// Al crear el método estático no necesitamos hacer esto --> Utilidades ut1 =
		// new Utilidades();

		System.out.println(Utilidades.numeroPrimo(7));
		System.out.println(Utilidades.parImpar(7));

		if (Utilidades.numeroPrimo(v1.getPvp())) {
			System.out.println("Primo");
		} else {
			System.out.println("no es Primo");
		}

		if (Utilidades.parImpar(v1.getPvp())) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		System.out.println();
		Vehículo v2 = new Vehículo();
		v2.constructor();
		
		System.out.println();
		Vehículo v3=new Vehículo(2);
		v3.constructor();
		
		System.out.println();
		Vehículo v4=new Vehículo('A');
		v4.constructor();
		
		System.out.println();
		Vehículo v5=new Vehículo(19000, "Bastidor 1");
		v5.constructor();

	}

}
