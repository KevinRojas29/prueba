package org.example;

public class Cuadrado extends Figuras {
    public Cuadrado(String nombre, int lado) {
        super(nombre, "Cuadrado", lado, lado);
    }

    @Override
    public int calcularArea() {
        return base * base;
    }
}
