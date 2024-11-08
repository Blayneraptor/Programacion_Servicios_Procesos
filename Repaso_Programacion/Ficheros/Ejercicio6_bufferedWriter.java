package Repaso_Programacion.Ficheros;

/*
- Lee un archivo de texto "texto.txt" y cuenta el número de palabras que contiene.
- Asume que las palabras están separadas por espacios.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6_bufferedWriter {
    public static void main(String[] args) {
        String nombreArchivo = "texto.txt";
        int contadorPalabras = 0;

        // Lectura del archivo y conteo de palabras
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                // Divide la línea en palabras usando espacios como delimitador
                String[] palabras = linea.split("\\s+"); // "\\s+" detecta uno o más espacios consecutivos
                contadorPalabras += palabras.length;
            }

            System.out.println("El archivo '" + nombreArchivo + "' contiene " + contadorPalabras + " palabras.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
