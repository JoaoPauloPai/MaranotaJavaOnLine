package com.jumbo.javacore.Oexepcion.checkedexption.classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando Leitor 2");
    }
}
