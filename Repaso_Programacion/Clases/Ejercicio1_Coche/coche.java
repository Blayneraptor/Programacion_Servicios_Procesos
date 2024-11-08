package Repaso_Programacion.Clases.Ejercicio1_Coche;

/* Ejercicio 1:
Define una clase Coche que tenga como atributos el modelo y la velocidadMaxima.
Añade un método mostrarCaracteristicas() que imprima los datos del coche.
Crea una instancia de esta clase en el main y llama al método mostrarCaracteristicas().

 Autor: Jose P. Couso "Blayneraptor" */

// Definición de la clase Coche
class Coche {
    // Atributos de la clase Coche
    String modelo;
    int velocidadMaxima;

    // Constructor de la clase Coche
    public Coche(String modelo, int velocidadMaxima) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar las características del coche
    public void mostrarCaracteristicas() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
