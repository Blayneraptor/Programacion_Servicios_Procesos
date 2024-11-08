package Repaso_Programacion.Ficheros;

/*
- Almacena una serie de números enteros en un archivo binario "numeros.bin".
- Luego, lee el archivo y muestra los números por consola.

  Autor: Jose P. Couso "Blayneraptor"
*/

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio8_clases_alto_nivel {
    public static void main(String[] args) {
        String archivoBinario = "numeros.bin";

        // Arreglo de números enteros a almacenar
        int[] numeros = { 10, 20, 30, 40, 50, 60, 70 };

        // Escribir los números en el archivo binario
        try (DataOutputStream salida = new DataOutputStream(new FileOutputStream(archivoBinario))) {
            // Escribir los números enteros
            for (int numero : numeros) {
                salida.writeInt(numero);
            }
            System.out.println("Números almacenados exitosamente en '" + archivoBinario + "'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        // Leer los números del archivo binario
        try (DataInputStream entrada = new DataInputStream(new FileInputStream(archivoBinario))) {
            System.out.println("Números leídos desde el archivo '" + archivoBinario + "':");
            // Leer y mostrar los números
            while (entrada.available() > 0) {
                int numero = entrada.readInt();
                System.out.println(numero);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
