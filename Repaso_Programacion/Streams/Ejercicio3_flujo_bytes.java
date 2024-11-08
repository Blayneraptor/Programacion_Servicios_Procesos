package Repaso_Programacion.Streams;

/* Crea un programa que copie un archivo de imagen (por ejemplo, "foto.jpg") a otro archivo (por ejemplo, "foto_copia.jpg")
 utilizando FileInputStream y FileOutputStream.
 
 Autor: Jose P. Couso "Blayneraptor" */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio3_flujo_bytes {
    public static void main(String[] args) {
        // Nombre del archivo de origen y el de destino
        String archivoOrigen = "foto.jpg";
        String archivoDestino = "foto_copia.jpg";

        // Copiar el archivo usando FileInputStream y FileOutputStream
        try (FileInputStream entrada = new FileInputStream(archivoOrigen);
             FileOutputStream salida = new FileOutputStream(archivoDestino)) {

            byte[] buffer = new byte[1024]; // Buffer para almacenar los bytes leídos
            int bytesLeidos;

            // Leer y escribir en bloques de 1024 bytes
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos);
            }

            System.out.println("El archivo ha sido copiado exitosamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al copiar el archivo.");
            e.printStackTrace();
        }
    }
}
