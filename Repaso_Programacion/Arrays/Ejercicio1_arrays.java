package Repaso_Programacion.Arrays;

/*- Crea un array de enteros de tamaño 10.
- Llena el array con números aleatorios del 1 al 100 y luego imprime todos los elementos del array en orden.
- A continuación, imprime los elementos del array en orden inverso.

Autor: Jose P. Couso Pérez  */

import java.util.Random;

public class Ejercicio1_arrays {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el array con números aleatorios del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Imprimir el array en orden
        System.out.println("Array en orden:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        // Imprimir el array en orden inverso
        System.out.println("\nArray en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}