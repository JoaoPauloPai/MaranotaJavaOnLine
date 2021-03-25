package com.jumbo.javacore.Eblocodeinicializacao.test;

import com.jumbo.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("\nTotal De Parcelas Possíveis");
        for (int parcela : c.getParceleas()){
            System.out.print(parcela + " ");
        }
    }
}
