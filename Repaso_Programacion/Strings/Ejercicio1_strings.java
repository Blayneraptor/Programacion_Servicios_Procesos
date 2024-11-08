package Repaso_Programacion.Strings;

import java.util.Scanner;

/* Crea un programa en Java que realice las siguientes acciones:
 1. Solicita al usuario que introduzca dos cadenas de texto (String) por consola.
 2. Concatena ambas cadenas en una nueva variable.
 3. Muestra la cadena resultante.
 4. Pide al usuario que introduzca un carácter y busca ese carácter en la cadena concatenada, mostrando la posición en la que se encuentra.
 Si no se encuentra, muestra un mensaje indicando que el carácter no está presente 
 
 Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio1_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar dos cadenas de texto al usuario
        System.out.print("Introduce la primera cadena de texto: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Introduce la segunda cadena de texto: ");
        String cadena2 = scanner.nextLine();

        // Paso 2: Concatenar ambas cadenas en una nueva variable
        String cadenaConcatenada = cadena1 + cadena2;

        // Paso 3: Mostrar la cadena resultante
        System.out.println("La cadena concatenada es: " + cadenaConcatenada);

        // Paso 4: Pedir un carácter al usuario y buscarlo en la cadena concatenada
        System.out.print("Introduce un carácter para buscar en la cadena concatenada: ");
        char caracter = scanner.nextLine().charAt(0);

        int posicion = cadenaConcatenada.indexOf(caracter);

        // Verificar si el carácter está en la cadena
        if (posicion != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El carácter '" + caracter + "' no está presente en la cadena concatenada.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
