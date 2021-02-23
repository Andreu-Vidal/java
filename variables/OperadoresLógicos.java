package variables;

public class OperadoresLógicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * == != >= <= > <
		 */
		
		int z=10;
		int r=9;
		System.out.println(z<r);
		
		/*
		 * && --> AND
		 * || --> OR
		 * !  --> NOT
		 * 
		 */
		
		int x=90;
		System.out.println(z<r || x>r);
		System.out.println(z<r && x>r);
		System.out.println( !(z<r && x>r) );
		
		//Operador Ternario
		String cadena=z<r? "Si" : "No";
		System.out.println(cadena);
		
		
		//COmprobar si un número es par
		int num1=10;
		int num2=2;
		System.out.println(num1%num2==0? "Par" : "Impar");
		
		
		
		
		
		
	}

}
