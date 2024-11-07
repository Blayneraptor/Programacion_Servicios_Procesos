package Repaso_Programacion.Arrays;

/*- Crea una matriz de 3x3 de tipo `int` y llénala con números aleatorios del 1 al 9.
- Después, imprime la matriz en formato de cuadrícula, mostrando los números en su disposición de filas y columnas.

Autor: Jose P. Couso Pérez */

import java.util.Random;

public class Ejercicio3_arrays {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();

        // Llenar la matriz con números aleatorios del 1 al 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }

        // Imprimir la matriz en formato cuadrícula
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}