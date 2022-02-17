package br.com.dio.models.calculadora;

import br.com.dio.models.Calculadora;

public class Divisao extends Calculadora {
    public Divisao (double a, double b) {
        super(a, b);

    }

    public double divisao (double a, double b) {
        double resultado ;
        if (b == 0) {
            System.out.println("Não é possível dividir por ZERO");
            return 0;
        } else {
            resultado = a / b;
        }
        return resultado;
    }
    }
