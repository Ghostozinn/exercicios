package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        // a) Crie dois objetos Carro e atribua valores diretamente [cite: 13]
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2023;

        // b) Imprima os dados de cada carro no console [cite: 14]
        System.out.println("Carro 1: " + carro1.marca + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro 2: " + carro2.marca + " " + carro2.modelo + " " + carro2.ano);
    }
}