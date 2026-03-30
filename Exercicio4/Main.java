package br.com.jj.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        // d) Ajuste para usar set em vez de acesso direto 
        Carro c1 = new Carro();
        c1.setMarca("Toyota"); 
        c1.setModelo("Corolla"); 
        c1.setAno(2022);
        listaDeCarros.add(c1);

        // Testando a validação (Ex 4c)
        Carro c2 = new Carro();
        c2.setMarca("Inválido");
        c2.setAno(1500); // Isso deve imprimir a mensagem de erro [cite: 26]
        listaDeCarros.add(c2);

        System.out.println("--- Lista de Carros (Encapsulados) ---");
        for (Carro carro : listaDeCarros) {
            carro.exibir();
        }
    }
}