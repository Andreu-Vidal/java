package herencia2;

public class Principal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setPatas(4);
		animal1.setColor("Blanco");
		System.out.println(animal1.sonido());
		System.out.println(animal1);
		System.out.println();
		// Objeto de la clase gato
		Gato gato1 = new Gato();
		System.out.println(gato1.sonido());
		System.out.println();
		// Objeto de la clase perro
		Perro perro1 = new Perro();
		perro1.setPatas(4);
		perro1.setColor("negro");
		perro1.setCastrado(false);
		perro1.setSexo('M');
		perro1.setPeligrosidad(false);

		System.out.println(perro1.sonido());
		System.out.println(perro1.chip());
		System.out.println(perro1);
		System.out.println("¿Es peligroso? " + perro1.isPeligrosidad());
		System.out.println();
		//Objeto de la clase hamster
		Hamster hamster1= new Hamster();
		System.out.println(hamster1.sonido());
		System.out.println();
		
		//Objetos de la clase pájaro
		Rapaz rapaz1=new Rapaz();
		rapaz1.setEnvergadura(7);
		rapaz1.setVelocidad(300);
		System.out.println(rapaz1.sonido());
		
		Periquito perico1= new Periquito();
		perico1.setCanta(true);
		
	}

}
