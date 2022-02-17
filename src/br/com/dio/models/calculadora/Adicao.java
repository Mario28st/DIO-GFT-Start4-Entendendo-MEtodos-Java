package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Adicao extends Calculadora {


    public Adicao(double a, double b) {
        super(a, b);
    }

    public double adicao(double a, double b) {
        return a+b;
    }
}
