package Repaso_Programacion.Ficheros;

/*
 Escribe un programa que liste todos los archivos y directorios de un directorio dado por el usuario.

  Autor: Jose P. Couso "Blayneraptor" */

import java.io.File;
import java.util.Scanner;

public class Ejercicio1_file{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la ruta del directorio
        System.out.print("Introduce la ruta del directorio: ");
        String rutaDirectorio = scanner.nextLine();
        
        // Crear un objeto File con la ruta proporcionada
        File directorio = new File(rutaDirectorio);
        
        // Verificar si la ruta es válida y si es un directorio
        if (directorio.exists() && directorio.isDirectory()) {
            System.out.println("Contenido del directorio:");
            
            // Listar todos los archivos y directorios dentro de la ruta especificada
            File[] contenido = directorio.listFiles();
            
            if (contenido != null) {
                for (File archivo : contenido) {
                    if (archivo.isDirectory()) {
                        System.out.println("[Directorio] " + archivo.getName());
                    } else {
                        System.out.println("[Archivo] " + archivo.getName());
                    }
                }
            } else {
                System.out.println("El directorio está vacío.");
            }
        } else {
            System.out.println("La ruta especificada no es válida o no es un directorio.");
        }
        
        scanner.close();
    }
}
