package herencia;

public class Principal {
	public static void main(String[] args) {

		/*
		 * Padre p1 = new Padre(1, "hola");
		 * 
		 * System.out.println(p1.getDato()); System.out.println(p1.getCod());
		 * 
		 * Hijo h1 = new Hijo(100, "Pedro"); h1.setPaga_semanal(200);
		 * 
		 * System.out.println(h1.getDato()); System.out.println(h1.getCod());
		 * System.out.println(h1.getPaga_semanal());
		 * System.out.println(h1.paga_mensual());
		 * 
		 * Expediente ex1 = new Expediente(10, "A"); ex1.setCodexpediente(100000);
		 * ex1.setDescripcion("Desripcionvckls ajnmkfjdkflasl");
		 * ex1.setResponsable("Pedro"); ex1.setTipo("Z"); ex1.verdatos();
		 * 
		 * Multa m1 = new Multa(20, "B"); m1.setCodexpediente(900000000);
		 * m1.setDescripcion("jadjfalñsdjflñasjdfñlajsf"); m1.setTipo("X");
		 * m1.setResponsable("Pepe"); m1.setImporte(1000);
		 * 
		 * m1.verdatos();
		 * 
		 * MultaTrafico m2 = new MultaTrafico(1000, "B");
		 * m2.setDescripcion("Saltar un ceda el paso"); m2.setResponsable("Conductor");
		 * m2.setFecha("10 de abril de 2021"); m2.setMatricula("7407 LFN");
		 * 
		 * m2.verdatos();
		 * 
		 * Multa_Covid m3 = new Multa_Covid(34, "B");
		 * m3.setDescripcion("Se denunció que no llevaba la mascarilla"); ;
		 * m3.setResponsable("Conductor"); m3.setFecha("10 de abril de 2021");
		 * m3.setMascarilla(false);
		 * 
		 * m3.verdatos(); // Llama al ver datos de Expediente que incluye 4 valores. Al
		 * faltar uno de los // // valores salta un null, porque no se ha rellenad dicho
		 * valor.
		 * 
		 * Expediente expe1 = new Expediente(10, "A");
		 * 
		 * System.out.println(); System.out.println(saberTipo(expe1));
		 * System.out.println(saberTipo(m3)); System.out.println(saberTipo(m2));
		 * 
		 * Multa m4 = new Multa(10, "A"); m4.setDescripcion("Saltarse un ceda el paso");
		 * m4.setResponsable("Conductor 1"); m4.setImporte(1000);
		 * 
		 * m4.verdatos();
		 * 
		 * System.out.println();
		 * 
		 * Multa m5 = new Multa(20, "B"); m5.setDescripcion("Exceso de velocidad");
		 * m5.setResponsable("Conductor 2"); m5.setImporte(10000);
		 * 
		 * m5.verdatos();
		 * 
		 * System.out.println();
		 * 
		 * System.out.println(compararImporte(m4, m5));
		 * System.out.println(conocerTipo(m1));
		 */
		//Crear un array de multa de 50 posiciones
		
		
		Multa multas[] = new Multa[50];
		
		//Relleno con descricion  e importe
		for (int i = 0; i < multas.length; i++) {
			multas[i]=new Multa (i, "A");
			multas[i].setDescripcion("Descripcion " + i);
			multas[i].setImporte((Math.random() * 100 + 25));
		}
		System.out.println(arrayMulta(multas));

	}

	public static String compararImporte(Multa imp1, Multa imp2) {

		String resultado = "Los dos importes son iguales";

		if (imp1.getImporte() > imp2.getImporte()) {

			resultado = "El importe mayor es le de la multa: " + imp1.getCodexpediente();

		} else if (imp1.getImporte() < imp2.getImporte()) {

			resultado = "El importe mayor es le de la multa: " + imp2.getCodexpediente();
		}
		return resultado;
	}

	public static String saberTipo(Expediente c1) {
		if (c1 instanceof Multa_Covid) {
			return "Eres Covid";
		}
		if (c1 instanceof MultaTrafico) {
			return "Eres Tráfico";
		}
		if (c1 instanceof Multa) {
			return "Eres Multa";
		}
		if (c1 instanceof Expediente) {
			return "Eres Expediente";
		}

		return "No se";
	}

	public static String conocerTipo(Object x) {
		return "" + x;
	}

	
	
	public static String arrayMulta(Multa[] m1) {
		double mayor=0;
		int codigo=0;
		for (int x = 0; x < m1.length; x++) {
			if (m1[x].getImporte()>mayor) {
				mayor =m1[x].getImporte();
				codigo=m1[x].getCodexpediente();
			}

		}
		return mayor + " "+ codigo;
		// Tener un método que recibirá un array de multas. Importe con math.random. La
		// multa que tiene mayor importe.

	}
}
