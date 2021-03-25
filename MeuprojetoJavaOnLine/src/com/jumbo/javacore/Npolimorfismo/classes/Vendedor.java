package com.jumbo.javacore.Npolimorfismo.classes;

public class Vendedor extends Funcionario{
  private double totalVenda;

    public Vendedor(String nome, double salario, double totalVenda) {
        super(nome, salario);
        this.totalVenda = totalVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalVenda * 0.5);
    }
}
