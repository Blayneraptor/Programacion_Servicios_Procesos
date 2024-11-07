package Repaso_Programacion.Arrays;

/*- Crea una función que reciba un array de enteros y devuelva la suma de todos sus elementos.
- Utiliza esta función en el método `main` para sumar los elementos de un array que hayas llenado previamente con valores aleatorios.

Autor: Jose P. Couso Pérez  */

import java.util.Random;

public class Ejercicio2_arrays {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el array con números aleatorios del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Calcular y mostrar la suma de los elementos
        System.out.println("Suma de los elementos del array: " + sumarArray(numeros));
    }

    // Función que recibe un array y devuelve la suma de sus elementos
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return suma;
    }
}