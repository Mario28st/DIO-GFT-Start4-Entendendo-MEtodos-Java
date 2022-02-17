package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Multiplicacao extends Calculadora {

    public Multiplicacao(double a, double b) {
        super(a, b);
    }

    public double multiplicacao (double a, double b) {
        return a*b;
    }
}
