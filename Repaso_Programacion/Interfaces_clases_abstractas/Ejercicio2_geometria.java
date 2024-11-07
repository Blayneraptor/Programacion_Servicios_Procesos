package Repaso_Programacion.Interfaces_clases_abstractas;

/*- Define una clase abstracta `FiguraGeometrica` con un método abstracto `calcularArea()`.
- Crea clases `Circulo`, `Rectangulo` y `Triangulo` que extiendan `FiguraGeometrica` y proporcionen implementaciones concretas para `calcularArea()`.
- Crea una instancia de cada clase y muestra cómo se calculan las diferentes áreas.

Autor: Jose P. Couso Pérez */

// Clase abstracta FiguraGeometrica
abstract class FiguraGeometrica {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase Circulo que extiende FiguraGeometrica
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// Clase Rectangulo que extiende FiguraGeometrica
class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Clase Triangulo que extiende FiguraGeometrica
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Clase principal para probar las áreas de diferentes figuras
public class Ejercicio2_geometria {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(4, 6);
        FiguraGeometrica triangulo = new Triangulo(4, 7);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}