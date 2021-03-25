package com.jumbo.javacore.Npolimorfismo.classes;

public class DatabaseDAOImple implements GenericDAO{



    @Override
    public void save() {
        System.out.println("Salvando dados no Banco de dados!");
    }
}
