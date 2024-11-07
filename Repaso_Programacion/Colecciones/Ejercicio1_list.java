package Repaso_Programacion.Colecciones;

/*  Crea un programa en Java que:
 1. Declare una ArrayList de números enteros.
 2. Pida al usuario que introduzca 5 números enteros y los añada a la lista.
 3. Muestre la lista completa.
 4. Elimine el tercer elemento de la lista y muestre la lista actualizada.
 5. Ordene la lista en orden ascendente y muestre el resultado.
 
  Autor: Jose P. Couso Pérez  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1_list {
    public static void main(String[] args) {
        // Paso 1: Declarar una ArrayList de números enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que introduzca 5 números enteros y añadirlos a la lista
        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Paso 3: Mostrar la lista completa
        System.out.println("Lista completa: " + numeros);

        // Paso 4: Eliminar el tercer elemento de la lista y mostrar la lista actualizada
        if (numeros.size() >= 3) {
            numeros.remove(2); // El tercer elemento está en la posición 2
            System.out.println("Lista después de eliminar el tercer elemento: " + numeros);
        } else {
            System.out.println("No hay suficientes elementos para eliminar el tercero.");
        }

        // Paso 5: Ordenar la lista en orden ascendente y mostrar el resultado
        Collections.sort(numeros);
        System.out.println("Lista ordenada en orden ascendente: " + numeros);

        // Cerrar el scanner
        scanner.close();
    }
}
