package arrays;

import java.util.Scanner;

public class TresenRayaCarlos {

    public static void main(String[] args) {
        // crear una matriz 3 x 3
        //pedir 1 posiciones (2 indices)
        //Poner la x en la posicion y pintar


        //creo la matriz
        String x[][] = new String [3][3];


        //la relleno con O
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = "O";
            }
        }

        //pido los 2 indices
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un indice: ");
        int n1 = scan.nextInt();

        System.out.println("Introduce otro indice: ");
        int n2 = scan.nextInt();


        //pongo la ficha X en el la posicion indicada
        x[n1][n2] = "X";
        //pinto el tablero
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

        scan.close();

    }

}