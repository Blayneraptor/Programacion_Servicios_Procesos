package Repaso_Programacion.Colecciones;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/* Crea un programa en Java que:
 1. Declare una LinkedList de cadenas de texto (Strings).
 2. Añada a la lista las siguientes cadenas: "Java", "Python", "C++", "JavaScript".
 3. Muestre la lista.
 4. Solicite al usuario una cadena de texto para buscar en la lista y muestre si está o no presente.
 5. Invierta el orden de los elementos en la lista y muestre el resultado

 Autor: Jose P. Couso "Blayneraptor"  */

public class Ejercicio2_linkedlist {
    public static void main(String[] args) {
        // Paso 1: Declarar una LinkedList de cadenas de texto
        LinkedList<String> listaLenguajes = new LinkedList<>();
        
        // Paso 2: Añadir cadenas de texto a la lista
        listaLenguajes.add("Java");
        listaLenguajes.add("Python");
        listaLenguajes.add("C++");
        listaLenguajes.add("JavaScript");
        
        // Paso 3: Mostrar la lista
        System.out.println("Lista de lenguajes: " + listaLenguajes);
        
        // Paso 4: Solicitar al usuario una cadena para buscar en la lista
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un lenguaje de programación para buscar en la lista: ");
        String lenguajeBuscado = scanner.nextLine();
        
        if (listaLenguajes.contains(lenguajeBuscado)) {
            System.out.println("El lenguaje \"" + lenguajeBuscado + "\" está presente en la lista.");
        } else {
            System.out.println("El lenguaje \"" + lenguajeBuscado + "\" no está presente en la lista.");
        }
        
        // Paso 5: Invertir el orden de los elementos en la lista y mostrar el resultado
        Collections.reverse(listaLenguajes);
        System.out.println("Lista en orden inverso: " + listaLenguajes);
        
        // Cerrar el scanner
        scanner.close();
    }
}