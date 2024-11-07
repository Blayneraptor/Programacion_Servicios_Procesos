package Repaso_Programacion.Encapsulacion_visibilidad.Ejercicio2_Password;

/*Crea una clase Password que represente una contraseña.
La clase debe tener un atributo privado password de tipo String.
Implementa un método cambiarPassword(String nuevoPassword) que permita cambiar la contraseña solo si la nueva cumple con ciertos criterios (por ejemplo, mínimo 8 caracteres y al menos un número).
Incluye también un método esFuerte() que determine si la contraseña tiene al menos 2 dígitos y 1 carácter especial.

Autor: Jose P. Couso Pérez*/

public class password {
    // Atributo privado
    private String password;

    // Constructor
    public password(String passwordInicial) {
        this.password = passwordInicial;
    }

    // Método para cambiar la contraseña con validación de longitud y al menos un
    // dígito
    public boolean cambiarPassword(String nuevoPassword) {
        if (nuevoPassword.length() >= 8 && contieneNumero(nuevoPassword)) {
            this.password = nuevoPassword;
            System.out.println("Contraseña cambiada exitosamente.");
            return true;
        } else {
            System.out.println("La nueva contraseña debe tener al menos 8 caracteres y contener al menos un número.");
            return false;
        }
    }

    // Método para verificar si la contraseña es fuerte
    public boolean esFuerte() {
        return tieneDosDigitos(password) && tieneCaracterEspecial(password);
    }

    // Métodos auxiliares
    private boolean contieneNumero(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean tieneDosDigitos(String str) {
        int contadorDigitos = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                contadorDigitos++;
            }
        }
        return contadorDigitos >= 2;
    }

    private boolean tieneCaracterEspecial(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}