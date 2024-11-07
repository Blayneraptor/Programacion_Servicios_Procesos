package Repaso_Programacion.Strings;

/* Crea un programa en Java que realice las siguientes acciones:
 1. Define dos variables String con valores "CadenaDePrueba" y "CADENAdePRUEBA" respectivamente.
 2. Convierte ambas cadenas a minúsculas y compara si son iguales, mostrando un mensaje con el resultado de la comparación.
 3. Crea un substring de la primera cadena que contenga los primeros 5 caracteres y muestra este nuevo substring por consola.
 4. Reemplaza todas las letras 'a' de la segunda cadena por el carácter '@' y muestra el resultado por consola.
 
  Autor: Jose P. Couso Pérez */

public class Ejercicio2_strings {
    public static void main(String[] args) {
        // Paso 1: Definir dos variables String
        String cadena1 = "CadenaDePrueba";
        String cadena2 = "CADENAdePRUEBA";
        
        // Paso 2: Convertir ambas cadenas a minúsculas y compararlas
        boolean sonIguales = cadena1.toLowerCase().equals(cadena2.toLowerCase());
        if (sonIguales) {
            System.out.println("Las cadenas son iguales cuando se convierten a minúsculas.");
        } else {
            System.out.println("Las cadenas no son iguales incluso en minúsculas.");
        }
        
        // Paso 3: Crear un substring de los primeros 5 caracteres de la primera cadena
        String subcadena = cadena1.substring(0, 5);
        System.out.println("El substring de los primeros 5 caracteres de cadena1 es: " + subcadena);
        
        // Paso 4: Reemplazar todas las letras 'a' de la segunda cadena por '@'
        String cadenaReemplazada = cadena2.replace('a', '@');
        System.out.println("La segunda cadena después de reemplazar 'a' con '@' es: " + cadenaReemplazada);
    }
}
