package com.jumbo.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {


    private double salario;
    {
        System.out.println("Dentro do bloco Funcionario 01");
    }
    {
        System.out.println("Dentro do bloco Funcionario 02");
    }
    {
        System.out.println("Dentro do bloco Funcionario 03");
    }
    public Funcionario() {
        System.out.println("Dentro co construtor Funcionario");
    }

    public void imprimir() {

        super.imprimir();

        System.out.println("salario: " + this.salario);
        imprimirReciboPagamento();

    }

    public void imprimirReciboPagamento() {
        System.out.println("--------------Recibo-----------------");
        System.out.println("Eu, " + this.nome + ", " + "recebi o valor de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
