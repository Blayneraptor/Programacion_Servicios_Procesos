package Repaso_Programacion.Excepciones;

import java.util.Scanner;

/* Crea un programa en Java que:
 1. Solicite al usuario que introduzca dos números enteros por consola.
 2. Realice la división del primer número entre el segundo y muestre el resultado.
 3. Implemente manejo de excepciones para capturar y manejar adecuadamente ArithmeticException en caso de que el usuario intente
 dividir por cero.
 4. Asegúrese de que, después de una excepción, el programa siga funcionando y permita al usuario intentar de nuevo con nuevos números.
 
 Autor: Jose P. Couso "Blayneraptor" */

public class Ejercicio1_excepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            try {
                // Paso 1: Solicitar al usuario que introduzca dos números enteros
                System.out.print("Introduce el primer número: ");
                int num1 = scanner.nextInt();

                System.out.print("Introduce el segundo número: ");
                int num2 = scanner.nextInt();

                // Paso 2: Realizar la división
                int resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);

                // Si la división fue exitosa, salir del ciclo
                seguir = false;

            } catch (ArithmeticException e) {
                // Paso 3: Manejar ArithmeticException (división por cero)
                System.out.println("Error: No se puede dividir por cero. Intenta de nuevo.");

            } catch (Exception e) {
                // Manejar otros posibles errores (por ejemplo, si el usuario introduce algo que
                // no es un número)
                System.out.println("Error: Entrada inválida. Por favor ingresa números enteros.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}