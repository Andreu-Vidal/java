package herencia2;

public class Rapaz extends Pajaro {
	
	private int envergadura;
	private double velocidad;
	public int getEnvergadura() {
		return envergadura;
	}
	public void setEnvergadura(int envergadura) {
		this.envergadura = envergadura;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Graznido";
	}
	
	

}
