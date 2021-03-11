package interfaz;

public interface Int_Vehiculo {
	int VELOCIDAD_MAXIMA = 120;

	// Declarar Métodos

	String frenar(int velocidad);

	String acelerar(int velocidad);

	Double calcularPrecio(int pvp);
}
