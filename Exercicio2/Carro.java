package br.com.jj.exercicios;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    // Exercício 2a - Método void: Apenas executa a ação de imprimir
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }

    // Exercício 2b - Método com retorno: Devolve um número inteiro (int)
    public int idadeDoCarro() {
        return 2026 - ano;
    }
}