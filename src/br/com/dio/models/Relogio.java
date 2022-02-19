package br.com.dio.models;

public class Relogio {

int hora;

    public Relogio(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Relogio() {
    }

    public void Mensagem (int hora) {
        if (hora < 0 || hora > 24) {
            System.out.println("hora incorreta. Programa encerrado!");
        } else {
            switch (hora / 6) {
                case (1) -> System.out.println("Bom dia!");
                case (2) -> System.out.println("Boa tarde!");
                case (3) -> System.out.println("Boa noite!");
                case (4) -> System.out.println("Boa noite!");
                default -> System.out.println("Boa madrugada!");
            }
        }
    }
}
