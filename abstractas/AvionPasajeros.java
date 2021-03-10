package abstractas;

public class AvionPasajeros extends Avion {
	/*
	 * Pasajero int pilotos int
	 * 
	 * Métodos repostar --> Reposto en el aeropuerto y en la base
	 * 
	 * beneficio(double pvp_billete) --> billete por número de pasajeros
	 */

	private int pasajeros;
	private int pilotos;

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getPilotos() {
		return pilotos;
	}

	public void setPilotos(int pilotos) {
		this.pilotos = pilotos;
	}

	@Override
	public String repostar() {
		// TODO Auto-generated method stub
		return "Reposto en en el aeropueto y en base";
	}

	public String beneficio(double pvp_billetes) {
		return "La ganancia por la venta de billetes es: " + (pvp_billetes * pasajeros) + "€.";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un " + getModelo() + " de " + pilotos + " pilotos con una capacidad de " + pasajeros
				+ " pasajeros y un tonelaje de " + getTonelaje() + ".";
	}

		
	@Override
	public boolean equals(Object obj) {
		// Convertimos obj a AvionPasajeros
		AvionPasajeros avion2 = (AvionPasajeros) obj;

		if (this.getPasajeros() == avion2.getPasajeros() && this.getModelo() == avion2.getModelo()) {
			return true;
		} else {
			return false;
		}
	}

}
