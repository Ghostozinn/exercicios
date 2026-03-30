package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // 'b' recebe uma cópia do valor de 'a'

        b = 99; // Alterar 'b' não afeta 'a'

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
    }
}