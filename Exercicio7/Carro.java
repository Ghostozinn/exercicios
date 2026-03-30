package br.com.jj.exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // a) Atributo estático: compartilhado por todos os carros (Ex 7)
    public static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        // Incrementar o total sempre que um carro novo for criado
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        // Incrementar também no construtor vazio
        totalCarros++;
    }

    // Mantenha seus Getters, Setters e o método exibir()
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }

    public void setAno(int ano) {
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        }
    }
}