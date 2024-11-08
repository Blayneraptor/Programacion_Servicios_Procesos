package Repaso_Programacion.Streams;

/*Crea un programa en Java que utilice FileWriter para escribir tres líneas de texto en un archivo llamado "texto.txt". Luego, usa FileReader para
 leer el contenido del archivo y mostrarlo por consola.
 
 Autor: Jose P. Couso "Blayneraptor" */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ejercicio1_flujo_caracteres {
    public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "texto.txt";

        // Escribir en el archivo
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write("Primera línea de texto.\n");
            escritor.write("Segunda línea de texto.\n");
            escritor.write("Tercera línea de texto.\n");
            System.out.println("Texto escrito en el archivo exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        // Leer el archivo
        try (FileReader lector = new FileReader(nombreArchivo);
             BufferedReader buffer = new BufferedReader(lector)) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
