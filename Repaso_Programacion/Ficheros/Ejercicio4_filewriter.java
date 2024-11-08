package Repaso_Programacion.Ficheros;

/*
- Lee el contenido de un archivo "libro.txt" y muestra el texto en consola, página por página.
- Una página está compuesta por un número fijo de líneas.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4_filewriter {
    // Número fijo de líneas por página
    private static final int LINEAS_POR_PAGINA = 20;

    public static void main(String[] args) {
        String nombreArchivo = "libro.txt";
        
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
             Scanner scanner = new Scanner(System.in)) {
            
            String linea;
            int lineasLeidas = 0;

            System.out.println("Mostrando contenido de '" + nombreArchivo + "' página por página.\n");

            // Leer y mostrar el contenido del archivo página por página
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                lineasLeidas++;

                // Si se alcanza el número de líneas por página, pausar y esperar entrada del usuario
                if (lineasLeidas == LINEAS_POR_PAGINA) {
                    System.out.print("\n--- Presiona Enter para continuar a la siguiente página ---");
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    lineasLeidas = 0; // Reiniciar el contador de líneas para la nueva página
                }
            }
            
            System.out.println("\nFin del archivo.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
