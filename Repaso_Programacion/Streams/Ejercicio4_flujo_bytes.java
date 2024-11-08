package Repaso_Programacion.Streams;

/* Escribe un programa que use DataOutputStream para escribir una serie de valores primitivos en un archivo "datos.bin" y luego
 use DataInputStream para leerlos y mostrarlos por consola.
 
 Autor: Jose P. Couso "Blayneraptor" */

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio4_flujo_bytes {
    public static void main(String[] args) {
        // Nombre del archivo binario
        String nombreArchivo = "datos.bin";

        // Escritura de datos primitivos en el archivo
        try (DataOutputStream salida = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            // Escribimos varios tipos de datos primitivos
            salida.writeInt(42);             // Escribir un entero
            salida.writeDouble(3.14159);     // Escribir un double
            salida.writeBoolean(true);       // Escribir un boolean
            salida.writeUTF("Hola, mundo!"); // Escribir una cadena (UTF)

            System.out.println("Datos escritos en el archivo 'datos.bin' exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        // Lectura de datos primitivos del archivo
        try (DataInputStream entrada = new DataInputStream(new FileInputStream(nombreArchivo))) {
            // Leer y mostrar los datos en el mismo orden en que se escribieron
            int numero = entrada.readInt();
            double decimal = entrada.readDouble();
            boolean valorBooleano = entrada.readBoolean();
            String texto = entrada.readUTF();

            System.out.println("Contenido del archivo 'datos.bin':");
            System.out.println("Entero: " + numero);
            System.out.println("Double: " + decimal);
            System.out.println("Boolean: " + valorBooleano);
            System.out.println("Texto: " + texto);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer del archivo.");
            e.printStackTrace();
        }
    }
}
