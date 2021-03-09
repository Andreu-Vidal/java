package herencia;

public class Multa extends Expediente {
	
	public Multa(int codexpediente, String tipo) {
		super(codexpediente, tipo);
		// TODO Auto-generated constructor stub
	}

	private double importe=0;

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public void verdatos() {
		// TODO Auto-generated method stub
		super.verdatos();
		
		System.out.println("El importe es: " +getImporte() + "€.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDescripcion() + "y el responsable es "+getResponsable();
	}
	
	
	
	

}
