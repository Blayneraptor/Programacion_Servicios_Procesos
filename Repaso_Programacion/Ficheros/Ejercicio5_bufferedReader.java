package Repaso_Programacion.Ficheros;

/*
- Desarrolla un programa que copie el contenido de un archivo de texto "original.txt" a un nuevo archivo "copia.txt".
- Asegúrate de que cada línea se copie correctamente.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5_bufferedReader {
    public static void main(String[] args) {
        String archivoOriginal = "original.txt";
        String archivoCopia = "copia.txt";

        // Intentar copiar el contenido línea por línea
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCopia))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine(); // Asegura que cada línea termina en una nueva línea en el archivo de destino
            }

            System.out.println("El archivo ha sido copiado exitosamente de 'original.txt' a 'copia.txt'.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al copiar el archivo.");
            e.printStackTrace();
        }
    }
}
