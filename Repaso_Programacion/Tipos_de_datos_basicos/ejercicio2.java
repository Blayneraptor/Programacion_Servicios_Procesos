package Repaso_Programacion.Tipos_de_datos_basicos;

import java.util.Scanner;

/* Ejercicio 1:
 Escribe un programa que convierta grados Celsius a Fahrenheit.
 El usuario debe ingresar la temperatura en Celsius como un float, y el
 programa debe mostrar el resultado en Fahrenheit utilizando el tipo double.
 La fórmula para la conversión es F = C * 9/5 + 32.

Autor: Jose P. Couso Pérez*/

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la temperatura en Celsius con decimales:");
        float celsius = sc.nextFloat();

        double resultado = celsius * 9 / 5 + 32;

        System.out.println("El resultado en Farenheit sería: " + resultado);

        sc.close();
    }

}
