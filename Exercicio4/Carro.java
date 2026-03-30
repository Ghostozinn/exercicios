package br.com.jj.exercicios;

public class Carro {
    // a) Atributos privados (Encapsulamento) [cite: 23]
    private String marca;
    private String modelo;
    private int ano;

    // b) Getters e Setters [cite: 24]
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    
    public void setAno(int ano) {
        // c) Validação: ano entre 1886 e 2026 [cite: 25]
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        } else {
            // Se o valor for inválido, imprime erro e não altera [cite: 26]
            System.out.println("Erro: Ano " + ano + " inválido! O valor não foi alterado.");
        }
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}