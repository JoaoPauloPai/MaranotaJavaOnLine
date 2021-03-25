package com.jumbo.javacore.Hheranca.classes;

public class Pessoa {

    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected Endereco endereco;


    public Pessoa() {
        System.out.println("--------------------------");
        System.out.println("Dentro do contrutor Pessoa");
        System.out.println("**************************");
    }

    static {
        System.out.println("Bloco de Inicialização Pessoa Státic 01");
    }

    {
        System.out.println("Bloco de inicialização Pessoa Státic 02");
    }

    {
        System.out.println("Bloco de Inicilização Pessoa Státic 03");
    }

    {
        System.out.println("Bloco de Inicialização Pessoa 01");
    }

    {
        System.out.println("Bloco de Inicialização Pessoa 02");
    }

    {
        System.out.println("Bloco de Inicialização Pessoa 03");
    }


    public void imprimir() {
        System.out.println("nome: " + this.nome);
        System.out.println("sobrenome: " + this.sobrenome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("end: " + this.endereco.getRua());
        System.out.println("bairro: " + this.endereco.getBairro());

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
