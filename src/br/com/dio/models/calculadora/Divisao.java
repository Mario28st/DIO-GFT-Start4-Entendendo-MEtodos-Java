package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Divisao extends Calculadora {
    public Divisao (double a, double b) {
        super(a, b);

    }

    public void divisao (double a, double b) {
        if (b == 0) {
            System.out.println("Não é possível dividir por ZERO");
        } else {
            System.out.println("A divisão de " + a + " / " + b + " é " + (a / b));
        }
    }
    }
