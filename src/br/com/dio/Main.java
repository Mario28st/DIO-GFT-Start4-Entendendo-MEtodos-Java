package br.com.dio;

import br.com.dio.models.calculadora.Adicao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado;
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        Adicao adicao = new Adicao(a, b);
        resultado = adicao.adicao(a, b);
        System.out.println("A adição de " + a + "+" + b + " é " + resultado);
    }
}
