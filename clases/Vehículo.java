package clases;

public class Vehículo {

	// Atributos de la clase
	private int tipo;
	private int ruedas;
	private String bastidor;
	private int cv;
	private double pvp;

	// constructor
	Vehículo() {
		ruedas = 4;
		tipo = 0;
		pvp = 0;
		cv = 0;
		bastidor = "Sin bastidor";

	}

	Vehículo(int ruedas) {
		this.ruedas = ruedas;
		tipo = 0;
		pvp = 0;
		cv = 0;
		bastidor = "Sin bastidor";

	}

	Vehículo(char p1) {
		switch (p1) {
		case 'A':
			tipo = 1;
			ruedas = 2;
			break;
		case 'B':
			tipo = 2;
			ruedas = 4;
			break;
		case 'C':
			tipo = 3;
			ruedas = 8;
			break;
		default:
			ruedas = 4;
			tipo = 0;

		}
		pvp = 0;
		cv = 0;
		bastidor = "Sin bastidor";
	}

	// Constructor que inicialice PVP y Bastidor

	Vehículo(double pvp, String bastidor) {
		this.pvp = pvp;
		this.bastidor = bastidor;
		ruedas = 4;
		tipo = 1;
		cv = 100;
	}

	public void constructor() {
		System.out.println("Ruedas: " + ruedas);
		System.out.println("Tipo: " + tipo);
		System.out.println("PVP: " + pvp);
		System.out.println("CV: " + cv);
		System.out.println("bastidor: " + bastidor);
	}

	// tipo string
	// ruedas int
	// bastidor string
	// cv int
	// pvp double

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if ((tipo >= 1) && (tipo <= 3)) {
			this.tipo = tipo;
		} else {
			System.out.println("Tipo no valido, solo del 1 al 3");
		}
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public int getCv() {
		return cv * 2;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public float precio() {
		float precio = 0;

		if (tipo == 1) {

			precio = (float) (pvp + (pvp * 0.1));

		} else if (this.tipo == 2) {

			precio = (float) (pvp + (pvp * 0.12));

		} else if (this.tipo == 3) {

			precio = (float) (pvp + (pvp * 0.15));

		}

		return precio;

	}

	// Crear un método llamado Precio
	// pvp + impuesto
	// tipo=1 --> 10
	// tipo=2 --> 12
	// tipo=3 --> 15
	// Cambiar el método setModelo
	// Sólo debe admitir del 1 al 3

}
