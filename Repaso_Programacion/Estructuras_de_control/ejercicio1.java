package Repaso_Programacion.Estructuras_de_control;

import java.util.Scanner;

/* Ejercicio 1:
Crea un programa que pida al usuario un número y determine si es par o impar
utilizando una estructura if-else. Además, el programa debe permitir al usuario introducir 
números hasta que ingrese un 0, momento en el cual el programa terminará.

Autor: Jose P. Couso Pérez*/

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduzca un número para verificar si es par o impar, (escriba 0 para terminar)");
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Se ha cerrado el programa");
            } else if (numero % 2 == 0) {
                System.out.println("El númnero es par");
            } else {
                System.out.println("El número es impar");
            }

        } while (numero != 0);

        sc.close();

    }
}
