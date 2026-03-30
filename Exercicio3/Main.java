package br.com.jj.exercicios;

import java.util.ArrayList; // Importação necessária para usar listas 

public class Main {
    public static void main(String[] args) {
        // Exercício 3 - Criando o ArrayList de objetos Carro 
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        // Criando e adicionando 3 carros na lista 
        Carro c1 = new Carro();
        c1.marca = "Toyota"; c1.modelo = "Corolla"; c1.ano = 2022;
        listaDeCarros.add(c1);

        Carro c2 = new Carro();
        c2.marca = "Honda"; c2.modelo = "Civic"; c2.ano = 2023;
        listaDeCarros.add(c2);

        Carro c3 = new Carro();
        c3.marca = "Ford"; c3.modelo = "Mustang"; c3.ano = 1969;
        listaDeCarros.add(c3);

        // Percorrendo a lista com for-each e chamando o método exibir() 
        System.out.println("--- Lista de Carros ---");
        for (Carro carro : listaDeCarros) {
            carro.exibir(); // Chama o método criado no exercício 2 
        }
    }
}