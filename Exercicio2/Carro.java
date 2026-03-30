package br.com.jj.exercicios;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }

    
    public int idadeDoCarro() {
        return 2026 - ano;
    }
}
