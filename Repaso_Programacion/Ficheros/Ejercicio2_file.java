package Repaso_Programacion.Ficheros;

/*
- Crea un archivo llamado "miArchivo.txt" y luego lo elimina.
- El programa debe informar en cada paso si la operación fue exitosa o no.

  Autor: Jose P. Couso "Blayneraptor" */

import java.io.File;
import java.io.IOException;

public class Ejercicio2_file {
    public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "miArchivo.txt";
        File archivo = new File(nombreArchivo);

        // Crear el archivo
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo '" + nombreArchivo + "' fue creado exitosamente.");
            } else {
                System.out.println("El archivo '" + nombreArchivo + "' ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }

        // Eliminar el archivo
        if (archivo.delete()) {
            System.out.println("El archivo '" + nombreArchivo + "' fue eliminado exitosamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo '" + nombreArchivo + "'.");
        }
    }
}
