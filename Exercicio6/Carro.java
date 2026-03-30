package br.com.jj.exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor do Exercício 5 (Parametrizado) [cite: 33]
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
    }

    // a) Exercício 6b - Segundo construtor (Sem parâmetros) [cite: 34]
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    // Mantenha os seus Getters, Setters e o método exibir()
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }

    public void setAno(int ano) {
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano " + ano + " inválido!");
        }
    }
}