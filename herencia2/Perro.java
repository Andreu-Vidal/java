package herencia2;

public class Perro extends Animal {

	private boolean peligrosidad;

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Guau";
	}

	public boolean isPeligrosidad() {
		return peligrosidad;
	}

	public void setPeligrosidad(boolean peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	@Override
	public String chip() {
		// TODO Auto-generated method stub
		return "NF-7890-HU-0102";
	}

}
