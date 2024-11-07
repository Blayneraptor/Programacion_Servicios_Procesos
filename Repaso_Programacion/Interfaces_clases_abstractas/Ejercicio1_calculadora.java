package Repaso_Programacion.Interfaces_clases_abstractas;

/*Crea una interfaz `OperacionesMatematicas` con métodos para sumar, restar, multiplicar y dividir dos números.
Luego crea una clase `Calculadora` que implemente esta interfaz y proporcione la implementación de estos métodos.

Autor: Jose P. Couso Pérez */

// Definir la interfaz OperacionesMatematicas
interface OperacionesMatematicas {
    double sumar(double a, double b);
    double restar(double a, double b);
    double multiplicar(double a, double b);
    double dividir(double a, double b);
}

// Implementar la interfaz en la clase Calculadora
class Calculadora implements OperacionesMatematicas {

    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Devuelve NaN si se intenta dividir por cero
        }
    }
}

// Clase Main para probar la implementación de la Calculadora
public class Ejercicio1_calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double a = 10;
        double b = 5;

        System.out.println("Suma: " + calculadora.sumar(a, b));
        System.out.println("Resta: " + calculadora.restar(a, b));
        System.out.println("Multiplicación: " + calculadora.multiplicar(a, b));
        System.out.println("División: " + calculadora.dividir(a, b));

        // Ejemplo de división por cero
        System.out.println("División por cero: " + calculadora.dividir(a, 0));
    }
}