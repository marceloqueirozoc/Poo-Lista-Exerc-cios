package com.mconstantino;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ronaldo");
        pessoa.setIdade(33);

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        pessoa.imprimir();
    }
}
