package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		Persona p2= new Persona();
		p1.mostrar();
		System.out.println(p1.saludar("hola"));
		p1.setNombre("Andreu");
		p2.setNombre("Rosa");
		
		p1.setSalario(10000);
		
		System.out.println(p1.getNombre() + " " + p2.getNombre());
		
	}
}
