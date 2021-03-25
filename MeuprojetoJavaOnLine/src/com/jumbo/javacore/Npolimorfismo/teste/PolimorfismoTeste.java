package com.jumbo.javacore.Npolimorfismo.teste;

import com.jumbo.javacore.Npolimorfismo.classes.Funcionario;
import com.jumbo.javacore.Npolimorfismo.classes.Gerente;
import com.jumbo.javacore.Npolimorfismo.classes.RelatorioPagamento;
import com.jumbo.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("José da Silva",2500,5000);
        Vendedor v = new Vendedor("Carlos Manoel",3900,5000);
        Vendedor v1 = new Vendedor("Marcos Antonio",3950,9000);

         RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
     //  relatorioPagamento.gerarRelatoriPagamentoGerente(g);
     //  System.out.println("----------------------------");
     //   relatorioPagamento.gerarRelatoriPagamentoVendedor(v);
        relatorioPagamento.gerarRelatorioGenerico(g);
        System.out.println("--------------------------------------");
        relatorioPagamento.gerarRelatorioGenerico(v);
        relatorioPagamento.gerarRelatorioGenerico(v1);

    }
}
