package Repaso_Programacion.Colecciones;

import java.util.Scanner;
import java.util.TreeSet;

/* Crea un programa en Java que:
 1. Declare un TreeSet y añada números enteros.
 2. Muestre el conjunto para ver que los elementos se ordenan automáticamente.
 3. Utiliza el método first() para mostrar el primer elemento y last() para mostrar el último.
 4. Pida al usuario un número y utilice higher() y lower() para encontrar el siguiente número más alto y el anterior número más bajo en el
 conjunto, respectivamente.
 
 Autor: Jose P. Couso "Blayneraptor"  */

public class Ejercicio4_treeset {
    public static void main(String[] args) {
        // Paso 1: Declarar un TreeSet de números enteros
        TreeSet<Integer> numeros = new TreeSet<>();

        // Añadir números al TreeSet
        numeros.add(10);
        numeros.add(20);
        numeros.add(5);
        numeros.add(30);
        numeros.add(15);

        // Paso 2: Mostrar el conjunto para ver que los elementos están ordenados
        System.out.println("Conjunto de números ordenado: " + numeros);

        // Paso 3: Mostrar el primer y último elemento
        System.out.println("Primer elemento: " + numeros.first());
        System.out.println("Último elemento: " + numeros.last());

        // Paso 4: Pedir al usuario un número y buscar el número más alto y más bajo en
        // el conjunto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para buscar el siguiente y el anterior en el conjunto: ");
        int numero = scanner.nextInt();

        // Encontrar el siguiente número más alto y el anterior número más bajo en el
        // conjunto
        Integer siguiente = numeros.higher(numero);
        Integer anterior = numeros.lower(numero);

        // Mostrar resultados
        if (anterior != null) {
            System.out.println("El número más bajo anterior a " + numero + " es: " + anterior);
        } else {
            System.out.println("No hay un número más bajo anterior a " + numero + " en el conjunto.");
        }

        if (siguiente != null) {
            System.out.println("El siguiente número más alto a " + numero + " es: " + siguiente);
        } else {
            System.out.println("No hay un número más alto siguiente a " + numero + " en el conjunto.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
