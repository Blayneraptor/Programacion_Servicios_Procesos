package Repaso_Programacion.Encapsulacion_visibilidad.Ejercicio1_CuentaBancaria;

/*Diseña una clase CuentaBancaria que encapsule el comportamiento de una cuenta.
Debe tener los atributos privados titular y saldo, y los
métodos públicos para depositar() y retirar() dinero, así como getSaldo() para consultar el saldo
Implementa también un método mostrarInformacion() para imprimir el titular y el saldo de la cuenta.

Autor: Jose P. Couso Pérez*/

public class cuentabancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public cuentabancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado: " + cantidad + "€. Nuevo saldo: " + saldo + "€.");
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado: " + cantidad + "€. Nuevo saldo: " + saldo + "€.");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo + "€.");
    }
}