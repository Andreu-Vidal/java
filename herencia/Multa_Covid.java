package herencia;

public class Multa_Covid extends Expediente {

	public Multa_Covid(int cod_expediente, String tipo) {
		super(cod_expediente, tipo);
		// TODO Auto-generated constructor stub
	}

	private boolean mascarilla;
	private String fecha;
	public boolean isMascarilla() {
		return mascarilla;
	}
	public void setMascarilla(boolean mascarilla) {
		this.mascarilla = mascarilla;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public void verdatos() {
		// TODO Auto-generated method stub
		super.verdatos();
		System.out.println("Mascarilla: " + mascarilla + " y la fecha es " + fecha);
	}
}
