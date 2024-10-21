package Repaso_Programacion.Clases.Ejercicio2_Calculadora;

public class calculadoraMain {

    public static void main(String[] args) {
    // Crear una instancia de la clase Calculadora
    Calculadora calculadora = new Calculadora();

    // Utilizar los métodos de la calculadora
    double suma = calculadora.sumar(10, 5);
    double resta = calculadora.restar(10, 5);
    double multiplicacion = calculadora.multiplicar(10, 5);
    double division = calculadora.dividir(10, 5);

    // Mostrar los resultados
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicación: " + multiplicacion);
    System.out.println("División: " + division);
}
}