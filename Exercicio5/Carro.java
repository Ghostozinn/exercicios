package br.com.jj.exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // a) Construtor parametrizado (Ex 5) 
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // Usamos o setter aqui para aproveitar a validação do Ex 4 [cite: 25]
    }

    // Mantenha os Getters, Setters e os outros métodos (exibir, idadeDoCarro)
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano " + ano + " inválido!");
        }
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }
}