package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Adicao extends Calculadora {


    public Adicao(double a, double b) {
        super(a, b);
    }

    public void adicao(double a, double b) {
        System.out.println("A adição de " + a + " + " + b + " é " + (a+b));
    }
}
