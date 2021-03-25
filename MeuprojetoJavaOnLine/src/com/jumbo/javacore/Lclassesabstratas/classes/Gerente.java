package com.jumbo.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calcularSalario(){
        this.salario = salario + (salario * 0.2);

    }

}
