package Repaso_Programacion.Colecciones;

import java.util.Map;
import java.util.TreeMap;

/* Crea un programa en Java que:
 1. Declare un TreeMap para contar la frecuencia de cada palabra en un texto.
 2. Añada varias palabras al Map, incrementando el contador cada vez que se añade una palabra repetida.
 3. Muestre el Map para ver las palabras ordenadas y su frecuencia 
 
  Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio8_treemap {
    public static void main(String[] args) {
        // Paso 1: Declarar un TreeMap para contar la frecuencia de cada palabra
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Texto de ejemplo (puedes modificarlo)
        String texto = "hola mundo hola java java mundo";

        // Paso 2: Añadir las palabras al TreeMap e incrementar el contador en caso de
        // repetición
        String[] palabras = texto.split(" "); // Separa el texto por espacios para obtener las palabras

        for (String palabra : palabras) {
            // Si la palabra ya está en el mapa, incrementa su contador, si no, inicializa a
            // 1
            wordCountMap.put(palabra, wordCountMap.getOrDefault(palabra, 0) + 1);
        }

        // Paso 3: Mostrar el TreeMap para ver las palabras ordenadas y su frecuencia
        System.out.println("Frecuencia de las palabras:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
