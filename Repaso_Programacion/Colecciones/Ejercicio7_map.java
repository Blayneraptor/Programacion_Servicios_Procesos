package Repaso_Programacion.Colecciones;

import java.util.HashMap;
import java.util.Scanner;

/*Crea un programa en Java que:
 1. Declare un HashMap y añada pares de palabras (palabra y sinónimo).
 2. Muestre el contenido del Map.
 3. Solicite al usuario una palabra y muestre su sinónimo si está en el Map, o un mensaje indicando que no se encontró. 
 
 Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio7_map {
    public static void main(String[] args) {
        // Paso 1: Declarar un HashMap y añadir pares de palabras y sinónimos
        HashMap<String, String> sinomimos = new HashMap<>();

        sinomimos.put("feliz", "contento");
        sinomimos.put("triste", "apenado");
        sinomimos.put("rápido", "veloz");
        sinomimos.put("lento", "pausado");
        sinomimos.put("inteligente", "listo");

        // Paso 2: Mostrar el contenido del HashMap
        System.out.println("Contenido del HashMap de sinónimos:");
        for (String palabra : sinomimos.keySet()) {
            System.out.println("Palabra: " + palabra + " - Sinónimo: " + sinomimos.get(palabra));
        }

        // Paso 3: Solicitar al usuario una palabra y mostrar su sinónimo si está en el
        // HashMap
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce una palabra para encontrar su sinónimo: ");
        String palabraUsuario = scanner.nextLine();

        // Buscar el sinónimo de la palabra introducida
        if (sinomimos.containsKey(palabraUsuario)) {
            System.out.println("El sinónimo de \"" + palabraUsuario + "\" es: " + sinomimos.get(palabraUsuario));
        } else {
            System.out.println("No se encontró un sinónimo para la palabra \"" + palabraUsuario + "\".");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
