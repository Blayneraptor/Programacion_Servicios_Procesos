package Repaso_Programacion.Arrays;

/*- Escribe un programa que defina una matriz de 4x4 y la llene con números secuenciales del 1 al 16.
- Luego, calcula e imprime la suma de los elementos de la diagonal principal (de arriba a la izquierda hacia abajo a la derecha).

Autor: Jose P. Couso Pérez*/

public class Ejercicio4_arrays{
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int contador = 1;
        int sumaDiagonal = 0;

        // Llenar la matriz con números secuenciales del 1 al 16
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador++;
            }
        }

        // Calcular la suma de la diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }

        // Imprimir la matriz y la suma de la diagonal principal
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}