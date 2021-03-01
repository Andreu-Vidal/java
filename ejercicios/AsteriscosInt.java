package ejercicios;

public class AsteriscosInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array de enteros de 10
		//Lo rellenamos con números del 1 al 10 aleatorios Math.random()*10+1
		//Por cada número, pintamos el mismo numero de asteríscos
		//2,3,4
		//2**
		//3***
		//4****
		
		//creamos el array
		int array1[]=new int[10];
		
		//Rellenarlo con número aleatorios
		for (int posicion=0; posicion<array1.length;posicion++)
		{
			array1[posicion]=(int) (Math.random()*10+1);
		}
		
		//por cada número del array
		for (int posicion=0; posicion<array1.length;posicion++)
		{
			System.out.print("Número: " + array1[posicion]+ "->");
			
			for(int asteriscos=0; asteriscos < array1[posicion]; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
