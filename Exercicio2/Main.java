package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        // Chamando o método void (Ex 2a)
        carro1.exibir();

        // Chamando o método com retorno e guardando o valor numa variável (Ex 2b)
        int idade = carro1.idadeDoCarro();
        System.out.println("Idade do carro: " + idade + " anos");

        /* RESPOSTA EXERCÍCIO 2c:
           O método 'idadeDoCarro' é o que DEVOLVE um valor (int), permitindo usá-lo em cálculos.
           O método 'exibir' é VOID, ou seja, ele apenas EXECUTA uma ação (imprimir) e não devolve nada.
        */
    }
}