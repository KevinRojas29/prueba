package org.example;

public abstract class Figuras {

    protected String nombre;
    protected String tipo;
    protected int base;
    protected int altura;

    public Figuras(String nombre, String tipo, int base, int altura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getbase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public abstract int calcularArea();
}
