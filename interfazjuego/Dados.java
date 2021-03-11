package interfazjuego;

import java.util.Scanner;

public class Dados extends Mensaje implements Juego, Ficheros {

	private String jugador1;
	private String jugador2;
	private int tirada_jugador1;
	private int tirada_jugador2;

	public void iniciar() {
		Scanner gamer = new Scanner(System.in);
		System.out.println("Introduzca el primer jugador");
		setJugador1(gamer.next());
		System.out.println();

		System.out.println("Introduzca el segundo jugador");
		setJugador2(gamer.next());
		System.out.println();

		System.out.println("Jugadores " + getJugador1() + " y " + getJugador2());
		System.out.println();

		gamer.close();
	}

	public void jugar() {
		tirada_jugador1 = (int) (Math.random() * 20) + 1;
		tirada_jugador2 = (int) (Math.random() * 20) + 1;
		System.out.println("El jugador 1 ha sacado un " + tirada_jugador1);
		System.out.println("El jugador 1 ha sacado un " + tirada_jugador2);

	}

	public void terminar() {

		if (tirada_jugador1 > tirada_jugador2) {
			System.out.println("Ha ganado el jugador 1");

		} else if (tirada_jugador1 < tirada_jugador2) {
			System.out.println("Ha ganado el jugador 2");

		} else {
			System.out.println("Empate");
		}

	}

	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	public void escribirResultado() {
		System.out.println("El resultado es: ");	

	}

	public String mensaje(String m) {
		// TODO Auto-generated method stub
		return ""+m;
	}

}
