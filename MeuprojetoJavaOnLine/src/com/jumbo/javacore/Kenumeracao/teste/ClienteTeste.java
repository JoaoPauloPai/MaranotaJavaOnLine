package com.jumbo.javacore.Kenumeracao.teste;

import com.jumbo.javacore.Kenumeracao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Anna", Cliente.PESSOA_FISICA);
        System.out.println(cliente);

    }
}
