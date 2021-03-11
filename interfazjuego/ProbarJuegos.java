package interfazjuego;

public class ProbarJuegos {
	
	public static void main(String[] args) {
	
	Dados d1=new Dados();
	d1.iniciar();
	d1.jugar();
	d1.terminar();
	d1.escribirResultado();
	System.out.println(d1.mensaje("End Game"));
		
	AdivinarNumero adi1=new AdivinarNumero();
	adi1.iniciar();
	adi1.jugar();
	adi1.terminar();
	adi1.escribirResultado();
	
	
	}
}
