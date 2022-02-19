package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Subtracao extends Calculadora {
    public Subtracao(double a, double b) {
        super(a, b);
    }

    public void subtracao (double a, double b) {
        System.out.println("A subtração de " + a + " - " + b + " é " + (a - b));
    }
}
