package com.jumbo.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {
/**  Código enxuto com o polimorfismo
 *
    public void gerarRelatoriPagamentoGerente(Gerente gerente){
        System.out.println("Relatório Pagamento Gerente");
        gerente.calcularPagamento();
        System.out.println("Nome    :"+ gerente.getNome());
        System.out.println("Salário :"+ gerente.getSalario());
    }

    public void gerarRelatoriPagamentoVendedor(Vendedor vendedor){
        System.out.println("Relatório Pagamento Vendedor");
        vendedor.calcularPagamento();
        System.out.println("Nome    :"+ vendedor.getNome());
        System.out.println("Salário :"+ vendedor.getSalario());
    }
**/
    public void gerarRelatorioGenerico(Funcionario funcionario){
        System.out.println("Relatório Pagamento Funcinário");
        funcionario.calcularPagamento();
        System.out.println("Nome    :"+ funcionario.getNome());
        System.out.println("Salário :"+ funcionario.getSalario());
        if (funcionario instanceof Gerente){
            //Gerente g = (Gerente) funcionario;
            System.out.println("Gerente");
            System.out.println("Participacao nos lucros: "+((Gerente) funcionario).getPnl());
        }
        if (funcionario instanceof Vendedor){
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Vendedor");
            System.out.println("Total Vendas: "+ v.getTotalVenda());
        }

    }
}
