package br.com.dio;

import br.com.dio.models.Relogio;
import br.com.dio.models.calculadora.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado;
        int opcao, item=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um dos itens abaixo: ");
        for (Operacoes operacao: Operacoes.values())
        {
            System.out.println(item + "-" + operacao);
            item += 1;
        }
        opcao = entrada.nextInt();
        while (opcao !=0) {
            switch (opcao) {
                case 1 -> {
                    System.out.println("ADIÇÃO");
                    System.out.println("Digitte a parcela 1");
                    double a = entrada.nextDouble();
                    System.out.println("Digitte a parcela 2");
                    double b = entrada.nextDouble();
                    Adicao adicao = new Adicao(a, b);
                    adicao.adicao(a, b);
                }
                case 2 -> {
                    System.out.println("SUBTRAÇÃO");
                    System.out.println("Digitte o minuendo");
                    double a = entrada.nextDouble();
                    System.out.println("Digitte o subtraendo");
                    double b = entrada.nextDouble();
                    Subtracao subtracao = new Subtracao(a, b);
                    subtracao.subtracao(a, b);
                }
                case 3 -> {
                    System.out.println("MULTIPLICAÇÃO");
                    System.out.println("Digitte o 1º fator");
                    double a = entrada.nextDouble();
                    System.out.println("Digitte o 2º fator");
                    double b = entrada.nextDouble();
                    Multiplicacao multiplicacao = new Multiplicacao(a, b);
                    multiplicacao.multiplicacao(a, b);
                }
                case 4 -> {
                    System.out.println("DIVISÃO");
                    System.out.println("Digitte divisor");
                    double a = entrada.nextDouble();
                    System.out.println("Digitte o dividendo");
                    double b = entrada.nextDouble();
                    Divisao divisao = new Divisao(a, b);
                    divisao.divisao(a, b);
                }
                case 0 -> System.out.println("Programa encerrado!");
                default -> System.out.println("Opção inválida! Digite uma opção válida.");
            }
            System.out.println("Escolha um dos itens abaixo: ");
            for (Operacoes operacao: Operacoes.values())
                 {
                     System.out.println(item + " - " + operacao);
                     item += 1;
            }
            System.out.println("Digite a nova opção: ");
            opcao = entrada.nextInt();

        }
        Relogio relogio1 = new Relogio();
        System.out.println("Digite a hora: ");
        relogio1.Mensagem(entrada.nextInt());
        Relogio relogio2 = new Relogio();
        System.out.println("Digite a hora: ");
        relogio2.Mensagem(entrada.nextInt());
        Relogio relogio3 = new Relogio();
        System.out.println("Digite a hora: ");
        relogio3.Mensagem(entrada.nextInt());
        Relogio relogio4 = new Relogio();
        System.out.println("Digite a hora: ");
        relogio4.Mensagem(entrada.nextInt());
        Relogio relogio5 = new Relogio();
        System.out.println("Digite a hora: ");
        relogio5.Mensagem(entrada.nextInt());

    }
}
