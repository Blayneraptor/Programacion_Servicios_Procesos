package Repaso_Programacion.Colecciones;

import java.util.HashSet;
import java.util.Scanner;

/* Crea un programa en Java que:
 1. Declare un HashSet y añada nombres de personas, asegurándote de que algunos nombres se repitan.
 2. Muestre el conjunto para que se vea que los duplicados se eliminan automáticamente.
 3. Solicite al usuario un nombre y compruebe si está en el conjunto, mostrando un mensaje adecuado
 
 Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio3_set {

    public static void main(String[] args) {
        // Paso 1: Declarar un HashSet y añadir nombres de personas, con algunos
        // duplicados
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Ana"); // Nombre duplicado
        nombres.add("María");
        nombres.add("Luis"); // Otro nombre duplicado
        nombres.add("Sofía");

        // Paso 2: Mostrar el conjunto para verificar que los duplicados se eliminan
        // automáticamente
        System.out.println("Conjunto de nombres sin duplicados: " + nombres);

        // Paso 3: Solicitar al usuario un nombre y comprobar si está en el conjunto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un nombre para buscar en el conjunto: ");
        String nombreBuscado = scanner.nextLine();

        if (nombres.contains(nombreBuscado)) {
            System.out.println("El nombre \"" + nombreBuscado + "\" está presente en el conjunto.");
        } else {
            System.out.println("El nombre \"" + nombreBuscado + "\" no está presente en el conjunto.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
