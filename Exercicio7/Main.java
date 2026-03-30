package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        // b) Criando 3 objetos para testar o contador
        Carro c1 = new Carro("Toyota", "Corolla", 2022);
        Carro c2 = new Carro("Honda", "Civic", 2023);
        Carro c3 = new Carro(); // Construtor vazio

        // c) Acesso via Classe: Repare que usamos 'Carro' (a classe) e não 'c1' ou 'c2'
        System.out.println("--- Relatório de Frota ---");
        System.out.println("Total de carros no sistema: " + Carro.totalCarros);

        /* d) Resposta Exercício 7d: 
           Usamos o nome da CLASSE (Carro.totalCarros) para acessar membros estáticos 
           porque eles pertencem à definição da classe na memória, e não ao estado 
           individual de um objeto específico.
        */
    }
}