package Repaso_Programacion.Polimorfismo;

/*- Implementa una clase base `Animal` con un método `hacerSonido()`.
- Luego, crea las clases `Perro` y `Gato` que extiendan de `Animal` y sobrescriban el método `hacerSonido()` para que el Perro "ladre" y el Gato "maúlle".
- Demuestra polimorfismo creando un método que acepte un objeto `Animal` y llame a `hacerSonido()`.

 Autor: Jose P. Couso "Blayneraptor" */

// Clase base Animal
abstract class Animal {
    // Método abstracto hacerSonido
    public abstract void hacerSonido();
}

// Clase Perro que extiende Animal
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

// Clase Gato que extiende Animal
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

// Clase principal para demostrar polimorfismo
public class Ejercicio1_animal_sonido {
    // Método que demuestra polimorfismo
    public static void emitirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamar al método emitirSonido para cada animal
        System.out.println("Sonido del Perro:");
        emitirSonido(perro);

        System.out.println("\nSonido del Gato:");
        emitirSonido(gato);
    }
}