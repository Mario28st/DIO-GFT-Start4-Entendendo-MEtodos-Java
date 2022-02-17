package br.com.dio.models;

public class Calculadora {

    private double a, b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
