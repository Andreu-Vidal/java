package clases;

public class Persona {
//propiedades (variables)

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}


	//estos atributos no se puede acceder fuera de las clases, Se accede con un métodos especiales, condiciones.
	private String nombre;
	private long salario;
	
//Métodos setters y getters
	
	
	
//Métodos
	public void mostrar()
	{
		System.out.println("Estoy en una instancia de la clase persona");
	}
	
	public String saludar(String nombre)
	{
		return nombre.toUpperCase();
	}
	
	
	//Al ser un método privado sólo puede invocarse desde la clase persona dónde se ha creado
	private void metodo_privado()
	{
		System.out.println("Estoy en un método privado");
	}
	
	
	
}
