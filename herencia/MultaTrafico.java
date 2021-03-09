package herencia;

public class MultaTrafico extends Expediente {

	public MultaTrafico(int codexpediente, String tipo) {
		super(codexpediente, tipo);
		// TODO Auto-generated constructor stub
	}


	private String matricula;
	private String fecha;
	
	
	@Override
	public void verdatos() {
		// TODO Auto-generated method stub
		super.verdatos();
		System.out.println("La matrícula es " + matricula + " y la fecha, " + fecha);
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	} 
	
	
	
	
}


