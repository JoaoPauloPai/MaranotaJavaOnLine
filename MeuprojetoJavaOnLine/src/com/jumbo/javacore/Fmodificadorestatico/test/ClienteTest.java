package com.jumbo.javacore.Fmodificadorestatico.test;


import com.jumbo.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("\nTotal De Parcelas Possíveis");
        for (int parcela : c.getParceleas()){
           // System.out.print(parcela + " ");
        }
        System.out.println("tamanho "+Cliente.getParceleas().length);
        System.out.println("tamanho "+Cliente.getParceleas().length);
        System.out.println("tamanho "+Cliente.getParceleas().length);
    }
}
