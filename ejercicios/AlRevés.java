package ejercicios;

public class AlRevés {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dos cadenas de enteros de 5 posiciones
		//Rellenamos una cadena con números
		//Pasamos los números de una cadena a otra dándoles la vuelta. Al reves
		//Es decir, cadena 1 tiene 1,2,3,4,5
		//la cadena 2 tiene que tener 5,4,3,2,1
		
		
		int[] c1 = new int[5];
		int[] c2 = new int[5];
		
		 c1 [0]=1;
		 c1 [1]=2;
		 c1 [2]=3;
		 c1 [3]=4;
		 c1 [4]=5;
		 
		 
		 for (int i=0; i<5 ; i++)
			 
		 {c2[i]=c1[4-i];
		 	System.out.print(c2[i]);
		}
	}
}

