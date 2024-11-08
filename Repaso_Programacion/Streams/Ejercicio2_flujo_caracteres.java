package Repaso_Programacion.Streams;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/*Modifica el ejercicio anterior para utilizar BufferedReader y BufferedWriter
 para escribir y leer un archivo de texto llamado "texto_buffered.txt".

 
Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio2_flujo_caracteres {
    public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "texto_buffered.txt";

        // Escribir en el archivo usando BufferedWriter
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            escritor.write("Primera línea de texto con BufferedWriter.\n");
            escritor.write("Segunda línea de texto con BufferedWriter.\n");
            escritor.write("Tercera línea de texto con BufferedWriter.\n");
            System.out.println("Texto escrito en el archivo exitosamente usando BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        // Leer el archivo usando BufferedReader
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo usando BufferedReader:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
