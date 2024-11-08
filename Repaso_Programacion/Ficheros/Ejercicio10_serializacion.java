package Repaso_Programacion.Ficheros;

/*
- Crea un programa que permita guardar una lista de objetos `Persona` (con nombre y edad) en un archivo usando serialización.
- Luego, recupera la lista completa de objetos desde el archivo y muestra la información de cada persona.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// Clase Persona que implementa Serializable para poder ser serializada
class Persona implements Serializable {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter para acceder a los datos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Ejercicio10_serializacion {
    public static void main(String[] args) {
        String nombreArchivo = "personas.ser"; // Nombre del archivo donde se guardará la lista de objetos serializados
        Scanner scanner = new Scanner(System.in);

        // Crear una lista para almacenar las personas
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // Añadir varias personas a la lista
        while (true) {
            System.out.print("Introduce el nombre de la persona (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break; // Finaliza el ciclo si el usuario escribe 'salir'
            }

            System.out.print("Introduce la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Crear una nueva persona y añadirla a la lista
            Persona persona = new Persona(nombre, edad);
            listaPersonas.add(persona);

            System.out.println("Persona añadida a la lista.");

            // Preguntar si desea agregar otro usuario
            System.out.print("¿Quieres agregar otra persona? (si/no): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }

        // Serializar la lista de personas y guardarla en el archivo
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(listaPersonas); // Guardar la lista completa de personas en el archivo
            System.out.println("\nLa lista de personas ha sido serializada y guardada en '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al serializar el objeto.");
            e.printStackTrace();
        }

        // Deserializar la lista de personas desde el archivo y mostrar la información
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            @SuppressWarnings("unchecked")
            ArrayList<Persona> listaPersonasRecuperada = (ArrayList<Persona>) entrada.readObject(); // Recuperar la
                                                                                                    // lista de personas
            System.out.println("\nInformación de las personas recuperadas desde el archivo:");
            for (Persona p : listaPersonasRecuperada) {
                p.mostrarInformacion();
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocurrió un error al deserializar el objeto.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
