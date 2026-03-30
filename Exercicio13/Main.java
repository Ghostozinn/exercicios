package br.com.jj.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Palio", 2010);
        alterarCarro(meuCarro);
        System.out.println("Modelo após o método: " + meuCarro.getModelo());
    }

    public static void alterarCarro(Carro c) {
        c.setModelo("Fusca");
    }
}