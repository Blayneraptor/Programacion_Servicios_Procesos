package Repaso_Programacion.Clases.Ejercicio1_Coche;

/* Ejercicio 1:
Define una clase Coche que tenga como atributos el modelo y la velocidadMaxima.
Añade un método mostrarCaracteristicas() que imprima los datos del coche.
Crea una instancia de esta clase en el main y llama al método mostrarCaracteristicas().

 Autor: Jose P. Couso "Blayneraptor" */

public class cocheMain {
    public static void main(String[] args) {
        // Crear una instancia de la clase Coche
        Coche miCoche = new Coche("Toyota Supra", 280);

        // Llamar al método mostrarCaracteristicas()
        miCoche.mostrarCaracteristicas();
    }
}