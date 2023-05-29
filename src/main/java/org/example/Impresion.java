package org.example;

import java.util.Random;

public class Impresion
{

    public static void main(String[] args) {
        Figuras[] figuras = new Figuras[64];
        int contador = 1;
        Random random = new Random();

        for (int i = 0; i < 64; i += 2) {
            int lado = random.nextInt(10) + 1;
            figuras[i] = new Cuadrado("# " + contador, lado);

            int base = random.nextInt(10) + 1;
            int altura = random.nextInt(10) + 1;
            figuras[i + 1] = new Rectangulo("# " + (contador + 1), base, altura);
            contador += 2;
        }

        for (Figuras figura : figuras) {
            System.out.println("La figura " + figura.getNombre() + ": " + figura.getTipo() + " <-- Su area es: " + figura.calcularArea());
        }
    }
}
