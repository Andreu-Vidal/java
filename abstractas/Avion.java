package abstractas;

public abstract class Avion {

	
	//Si una clase es abstracta no se pueden crear objetos de esa clase. Una clase abstracta s�lo vale para tener propiedades y m�todos comunes.
		
	private double tonelaje;
	private int potencia;
	private String modelo;
		
	
	public double getTonelaje() {
		return tonelaje;
	}
	public void setTonelaje(double tonelaje) {
		this.tonelaje = tonelaje;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String despegar()
	{
		return "Estoy despegando";
	}
	
	public String aterrizar()
	{
		return "Estoy aterrizando";
	}

	
	
	//M�todo abstracto. Lo tienes que definir en las clases hijas
	public abstract String repostar();
	
}
