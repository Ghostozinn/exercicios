package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "T", 1908);
        c1.exibir();

        System.out.println("O primeiro carro foi em: " + Carro.ANO_PRIMEIRO_CARRO);
    }
}