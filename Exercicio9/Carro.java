package br.com.jj.exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public static int totalCarros = 0;
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public void setAno(int ano) {
        if (ano >= ANO_PRIMEIRO_CARRO && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano inválido!");
        }
    }

    public void exibir() {
        System.out.println(marca + " " + modelo + " (" + ano + ")");
    }
}