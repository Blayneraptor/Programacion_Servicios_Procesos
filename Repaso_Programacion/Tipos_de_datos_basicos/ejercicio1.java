package Repaso_Programacion.Tipos_de_datos_basicos;

import java.util.*;

/* Ejercicio 1:
 Crea un programa que solicite al usuario introducir su edad y su altura.
 La edad debe almacenarse en una variable de tipo `int`, y la altura en una variable de tipo `double`.
 Imprime ambos valores con un mensaje apropiado.

Autor: Jose P. Couso Pérez*/

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        System.out.println("Introduzca su altura:");
        double altura = sc.nextDouble();

        System.out.println("Su edad es de " + edad + " años y su altura es " + altura + "m.");

        sc.close();
    }

}