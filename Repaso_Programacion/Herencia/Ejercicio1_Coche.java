package Repaso_Programacion.Herencia;

/*Ejercicio 1:
 Crea una clase Vehiculo con atributos marca, modelo y kilometraje. Luego, crea una clase Coche que herede de Vehiculo y añade un
 atributo numeroDePuertas. Implementa los métodos para obtener y establecer el valor de los atributos. Crea instancias de Coche y utiliza los
 métodos heredados y propios.
 
 Autor: Jose P. Couso Pérez*/

class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Métodos getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}

class Coche extends Vehiculo {
    // Atributo adicional
    private int numeroDePuertas;

    // Constructor
    public Coche(String marca, String modelo, int kilometraje, int numeroDePuertas) {
        super(marca, modelo, kilometraje); // Llama al constructor de la clase padre
        this.numeroDePuertas = numeroDePuertas;
    }

    // Métodos getter y setter para numeroDePuertas
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
}

public class Ejercicio1_Coche {
    public static void main(String[] args) {
        // Crear instancia de Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 50000, 4);

        // Usar métodos heredados de Vehiculo
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Kilometraje: " + miCoche.getKilometraje() + " km");

        // Usar métodos propios de Coche
        System.out.println("Número de puertas: " + miCoche.getNumeroDePuertas());

        // Modificar atributos usando setters
        miCoche.setKilometraje(55000);
        miCoche.setNumeroDePuertas(5);
        System.out.println("\nDespués de actualizar los valores:");
        System.out.println("Kilometraje: " + miCoche.getKilometraje() + " km");
        System.out.println("Número de puertas: " + miCoche.getNumeroDePuertas());
    }
}