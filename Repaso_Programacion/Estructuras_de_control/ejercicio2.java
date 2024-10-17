package Repaso_Programacion.Estructuras_de_control;

/* Ejercicio 1:
Escribe un programa que imprima los primeros 10 números de la serie Fibonacci.
La serie Fibonacci es una secuencia donde cada número es la
suma de los dos anteriores, empezando por 0 y 1.

Autor: Jose P. Couso Pérez*/

public class ejercicio2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c;

        System.out.println(a);

        for (int i = 1; i < 10; i++) {

            System.out.println(b);

            c = a + b;
            a = b;
            b = c;

        }

    }
}
