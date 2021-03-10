package abstractas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objeto de la clase caza
		Caza caza1 = new Caza();
		caza1.setModelo("F22-Raptor");
		caza1.setNum_misiles(6);
		caza1.setPotencia(1000);
		caza1.setArmamento("M61A2 Vulcan de 20 mm");
		System.out.println(caza1);
		System.out.println();

		// Objeto de la clase AvionPasajeros
		AvionPasajeros avion1 = new AvionPasajeros();
		avion1.setModelo("Airbus A-380");
		avion1.setPasajeros(200);
		avion1.setPilotos(2);
		avion1.setTonelaje(90000);
		System.out.println(avion1 + " " + avion1.beneficio(50));
		System.out.println();

		AvionPasajeros avion2 = new AvionPasajeros();
		avion2.setModelo("Airbus A-380 Plus");
		avion2.setPasajeros(300);
		avion2.setPilotos(3);
		avion2.setTonelaje(100000);
		System.out.println(avion2 + " " + avion1.beneficio(100));
		System.out.println();

		if (avion1.equals(avion2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		System.out.println();

		// Hay que definir en la clase cuándo un objeto es igual a otro
		Caza caza2 = new Caza();

		if (caza1.equals(caza2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}

}
