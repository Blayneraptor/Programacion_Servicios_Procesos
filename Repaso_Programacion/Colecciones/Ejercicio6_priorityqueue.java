package Repaso_Programacion.Colecciones;

import java.util.PriorityQueue;
import java.util.Random;

/* Crea un programa en Java que:
1. Declare una PriorityQueue de números enteros.
 2. Añada números aleatorios a la cola.
 3. Muestre cómo, al recuperar y eliminar los elementos con poll(), se obtienen en un orden basado en su prioridad natural (menor a
 mayor)

 Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio6_priorityqueue {
    public static void main(String[] args) {
        // Paso 1: Declarar una PriorityQueue de números enteros
        PriorityQueue<Integer> colaPrioritaria = new PriorityQueue<>();

        // Paso 2: Añadir números aleatorios a la cola
        Random random = new Random();
        System.out.println("Añadiendo números aleatorios a la PriorityQueue:");
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100); // Número aleatorio entre 0 y 99
            colaPrioritaria.add(numeroAleatorio);
            System.out.println("Número añadido: " + numeroAleatorio);
        }

        // Paso 3: Mostrar cómo, al recuperar y eliminar los elementos con poll(), se
        // obtienen en orden ascendente
        System.out.println("\nRecuperando y eliminando elementos de la PriorityQueue:");
        while (!colaPrioritaria.isEmpty()) {
            int numero = colaPrioritaria.poll(); // Eliminar y obtener el primer elemento (menor)
            System.out.println("Elemento recuperado y eliminado: " + numero);
        }

        // Mostrar mensaje cuando todos los elementos hayan sido procesados
        System.out.println("\nTodos los elementos han sido procesados.");
    }
}
