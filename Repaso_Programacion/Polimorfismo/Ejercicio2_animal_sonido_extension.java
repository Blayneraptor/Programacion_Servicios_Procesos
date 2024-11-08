package Repaso_Programacion.Polimorfismo;

/*- Extiende el ejercicio anterior añadiendo una nueva clase `Vaca` que herede de `Animal` y sobrescriba el método `hacerSonido()` para que diga "Muuu".
- Añade una instancia de `Vaca` al método `main` y utiliza el método `hacerSonido()` para demostrar el polimorfismo.

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

// Clase Vaca que extiende Animal
class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }
}

// Clase principal para demostrar polimorfismo
public class Ejercicio2_animal_sonido_extension {
    // Método que demuestra polimorfismo
    public static void emitirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Crear instancias de Perro, Gato y Vaca
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        // Llamar al método emitirSonido para cada animal
        System.out.println("Sonido del Perro:");
        emitirSonido(perro);

        System.out.println("\nSonido del Gato:");
        emitirSonido(gato);

        System.out.println("\nSonido de la Vaca:");
        emitirSonido(vaca);
    }
}