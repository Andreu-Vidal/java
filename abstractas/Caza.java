package abstractas;

public class Caza extends Avion {

	private String modelo;
	private int num_misiles;
	private String armamento;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNum_misiles() {
		return num_misiles;
	}

	public void setNum_misiles(int num_misiles) {
		this.num_misiles = num_misiles;
	}

	public String getArmamento() {
		return armamento;
	}

	public void setArmamento(String armamento) {
		this.armamento = armamento;
	}

	private String disparar(int misiles) {
		return "He disparado " + misiles + " misiles.";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un caza de la clase " + modelo + ", armado con una " + armamento + " y cuya capacidad en bodega es de " + num_misiles + " misiles.";
	}

	@Override
	public String repostar() {
		// TODO Auto-generated method stub
		return "Repostaje en tierra y en vuelo";
	}

}
