package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Subtracao extends Calculadora {
    public Subtracao(double a, double b) {
        super(a, b);
    }

    public double subtracao (double a, double b) {
        return a-b;
    }
}
