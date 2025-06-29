package com.healthtrack;

public class Usuario {
    private String nombre;
    private double peso;

    public Usuario(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void actualizarPeso(double nuevoPeso) {
    //  this.peso -= 1; Version Original
        this.peso = nuevoPeso; // Corrección aplicada
    }
    public void mostrarInformacion() {
    System.out.println("Usuario: " + nombre + ", Peso Actual: " + peso + " kg"); // agregado para una prueba al 100% cubierto
    }
}