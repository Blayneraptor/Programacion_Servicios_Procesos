package Repaso_Programacion.Ficheros;

/*
- Crea un programa que permita al usuario guardar información de un objeto de la clase Persona (con nombre y edad) en un archivo usando serialización.
- Luego, recupera esa información y muéstrala en consola.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.*;
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

public class Ejercicio9_serializacion {
    public static void main(String[] args) {
        String nombreArchivo = "persona.ser"; // Nombre del archivo donde se guardará el objeto serializado
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Persona a partir de los datos ingresados por el usuario
        System.out.print("Introduce el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce la edad de la persona: ");
        int edad = scanner.nextInt();

        // Crear el objeto Persona
        Persona persona = new Persona(nombre, edad);

        // Serializar el objeto Persona y guardarlo en el archivo
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(persona); // Guardar el objeto persona en el archivo
            System.out.println("La persona ha sido serializada y guardada en '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al serializar el objeto.");
            e.printStackTrace();
        }

        // Deserializar el objeto Persona desde el archivo y mostrar la información
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            Persona personaRecuperada = (Persona) entrada.readObject(); // Recuperar el objeto persona del archivo
            System.out.println("\nInformación recuperada del archivo:");
            personaRecuperada.mostrarInformacion();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocurrió un error al deserializar el objeto.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
