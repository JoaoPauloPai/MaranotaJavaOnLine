package com.jumbo.javacore.Minterfaces.teste;

import com.jumbo.javacore.Minterfaces.classes.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notboock",4,3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
