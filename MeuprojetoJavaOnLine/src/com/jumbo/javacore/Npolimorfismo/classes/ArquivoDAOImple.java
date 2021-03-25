package com.jumbo.javacore.Npolimorfismo.classes;

public class ArquivoDAOImple implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando dados no Arquivo");
    }
}
