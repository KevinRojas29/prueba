package org.example;

public class Rectangulo extends Figuras {

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre, "Rectangulo", base, altura);
    }

    @Override
    public int calcularArea() {
        return base * altura;
    }
}