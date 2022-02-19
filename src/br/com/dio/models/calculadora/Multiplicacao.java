package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Multiplicacao extends Calculadora {

    public Multiplicacao(double a, double b) {
        super(a, b);
    }

    public void multiplicacao (double a, double b) {
        System.out.println("A multiplicação de " + a + " X " + b + " é " + (a * b));
    }
}
