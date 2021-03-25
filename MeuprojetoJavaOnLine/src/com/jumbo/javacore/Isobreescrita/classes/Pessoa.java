package com.jumbo.javacore.Isobreescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public String toString() {

        return "Nome: " + nome + "  " + "Idade: " + idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
