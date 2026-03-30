package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        // Criando carro com o primeiro construtor (Ex 5)
        Carro carroA = new Carro("Toyota", "Corolla", 2022);
        
        // Criando carro com o segundo construtor (Ex 6) 
        Carro carroB = new Carro();

        System.out.println("--- Teste de Sobrecarga ---");
        carroA.exibir();
        carroB.exibir();

        /* c) Resposta Exercício 6c: 
           A diferença é que o primeiro construtor obriga a passagem de dados 
           específicos no momento da criação, enquanto o segundo (sobrecarregado) 
           permite criar o objeto com valores padrão pré-definidos ("Desconhecido"). 
        */
    }
}