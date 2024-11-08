package Repaso_Programacion.Colecciones;

import java.util.LinkedList;
import java.util.Queue;

/* Crea un programa en Java que:
 1. Declare una LinkedList como una Queue y añada nombres de tareas en una lista de tareas pendientes.
 2. Muestre la cola completa.
 3. Procese la cola mostrando y eliminando cada tarea por el orden en que fueron añadidas, usando el método poll().
 
 Autor: Jose P. Couso "Blayneraptor"  */

public class Ejercicio5_queue {
    public static void main(String[] args) {
        // Paso 1: Declarar una LinkedList como una Queue y añadir nombres de tareas
        Queue<String> tareasPendientes = new LinkedList<>();

        // Añadir tareas a la cola
        tareasPendientes.add("Tarea 1: Reunión con el equipo");
        tareasPendientes.add("Tarea 2: Revisar correos");
        tareasPendientes.add("Tarea 3: Preparar informe");
        tareasPendientes.add("Tarea 4: Llamar a cliente");
        tareasPendientes.add("Tarea 5: Terminar documentación");

        // Paso 2: Mostrar la cola completa
        System.out.println("Cola de tareas pendientes: " + tareasPendientes);

        // Paso 3: Procesar la cola, mostrando y eliminando cada tarea por orden de
        // llegada
        System.out.println("\nProcesando tareas...");
        while (!tareasPendientes.isEmpty()) {
            // Mostrar y eliminar la tarea al frente de la cola
            String tarea = tareasPendientes.poll();
            System.out.println("Procesando: " + tarea);
        }

        // Mostrar mensaje cuando todas las tareas han sido procesadas
        System.out.println("\nTodas las tareas han sido procesadas.");
    }
}
