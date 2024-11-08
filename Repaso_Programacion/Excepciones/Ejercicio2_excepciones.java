package Repaso_Programacion.Excepciones;

import java.util.Scanner;

/*  Crea un programa en Java que:
 1. Defina una clase de excepción personalizada InvalidInputException que se lance cuando el usuario ingrese un dato no válido.
 2. Solicite al usuario que ingrese su edad y valide que sea un número entero positivo.
 3. Si la entrada no es válida (por ejemplo, una cadena de texto o un número negativo), lance InvalidInputException.
 4. Implemente un bloque try-catch para capturar la excepción personalizada y proporcione al usuario un mensaje de error claro,
 invitándolo a ingresar un valor válido.
 5. El programa debe continuar solicitando la edad hasta que se ingrese un valor válido
 
 Autor: Jose P. Couso "Blayneraptor" */

// Paso 1: Definir la clase de excepción personalizada
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Ejercicio2_excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean edadValida = false;

        while (!edadValida) {
            try {
                // Paso 2: Solicitar la edad al usuario
                System.out.print("Introduce tu edad: ");
                String input = scanner.nextLine();

                // Intentar convertir la entrada a un número entero
                int edad = Integer.parseInt(input);

                // Paso 3: Validar que la edad sea un número entero positivo
                if (edad <= 0) {
                    throw new InvalidInputException("La edad debe ser un número entero positivo.");
                }

                // Si la edad es válida, mostrar el mensaje y salir del ciclo
                System.out.println("Edad válida: " + edad);
                edadValida = true;

            } catch (NumberFormatException e) {
                // Capturar excepción si no se puede convertir la entrada a un número
                System.out.println("Error: Debes ingresar un número entero.");
            } catch (InvalidInputException e) {
                // Capturar la excepción personalizada
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}
