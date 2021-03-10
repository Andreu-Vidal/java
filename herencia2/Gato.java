package herencia2;

public class Gato extends Animal {

	private boolean ronronea;

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miauu";
	}

	@Override
	public String chip() {
		// TODO Auto-generated method stub
		return "AV-5105-JL-4531";
	}

	public boolean isRonronea() {
		return ronronea;
	}

	public void setRonronea(boolean ronronea) {
		this.ronronea = ronronea;
	}

}
