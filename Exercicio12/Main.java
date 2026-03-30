package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "Corolla", 2022);
        Carro c2 = c1;

        c2.setModelo("Palio");

        System.out.println("Modelo do c1: " + c1.getModelo());
        System.out.println("Modelo do c2: " + c2.getModelo());
    }
}