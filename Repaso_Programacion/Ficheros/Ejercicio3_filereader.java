package Repaso_Programacion.Ficheros;

/*
- Crea un programa que permita al usuario escribir entradas en un diario.
- Cada entrada debe agregarse a un archivo "diario.txt", sin sobrescribir el contenido anterior.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3_filereader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "diario.txt";

        // Solicitar al usuario la entrada del diario
        System.out.println("Escribe una nueva entrada para tu diario:");
        String entradaDiario = scanner.nextLine();

        // Agregar la entrada al archivo sin sobrescribir el contenido anterior
        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) { // 'true' para activar el modo append
            escritor.write(entradaDiario + "\n");
            System.out.println("Entrada añadida exitosamente a 'diario.txt'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el diario.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
