package Repaso_Programacion.Ficheros;

/*
- Crea un programa que permita al usuario introducir datos de nuevos usuarios.
- Los datos de cada usuario deben incluir nombre y correo electrónico.
- La información debe almacenarse en un archivo "usuarios.txt".

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio7_clases_alto_nivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "usuarios.txt";

        // Intentar crear el archivo y escribir los datos
        try (PrintWriter escritor = new PrintWriter(nombreArchivo)) {
            String nombre, correo;

            // Solicitar la entrada de datos de varios usuarios
            while (true) {
                System.out.print("Introduce el nombre del usuario (o 'salir' para terminar): ");
                nombre = scanner.nextLine();

                if (nombre.equalsIgnoreCase("salir")) {
                    break; // Finaliza el ciclo si el usuario escribe 'salir'
                }

                System.out.print("Introduce el correo electrónico del usuario: ");
                correo = scanner.nextLine();

                // Escribir el nombre y correo en el archivo
                escritor.println("Nombre: " + nombre + ", Correo: " + correo);
                System.out.println("Usuario añadido exitosamente.");

                // Preguntar si desea agregar otro usuario
                System.out.print("¿Quieres agregar otro usuario? (si/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    break;
                }
            }

            System.out.println("Los datos de los usuarios han sido almacenados en '" + nombreArchivo + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error al crear o acceder al archivo.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
