package br.com.jj.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        // b) Criando objetos usando o construtor (Ex 5) 
        Carro c1 = new Carro("Toyota", "Corolla", 2022);
        listaDeCarros.add(c1);

        Carro c2 = new Carro("Volkswagen", "Fusca", 1970);
        listaDeCarros.add(c2);

        System.out.println("--- Lista de Carros (com Construtor) ---");
        for (Carro carro : listaDeCarros) {
            carro.exibir();
        }

        /* c) Resposta Exercício 5c: 
           A vantagem de usar o construtor é garantir que o objeto já seja 
           instanciado com todos os seus dados obrigatórios preenchidos, 
           evitando estados inconsistentes e reduzindo linhas de código repetitivas. [cite: 31]
        */
    }
}