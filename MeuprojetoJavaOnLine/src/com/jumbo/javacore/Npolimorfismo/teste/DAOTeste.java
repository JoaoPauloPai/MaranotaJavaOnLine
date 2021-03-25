package com.jumbo.javacore.Npolimorfismo.teste;

import com.jumbo.javacore.Npolimorfismo.classes.ArquivoDAOImple;
import com.jumbo.javacore.Npolimorfismo.classes.DatabaseDAOImple;
import com.jumbo.javacore.Npolimorfismo.classes.GenericDAO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAOImple();
        GenericDAO arquivo = new ArquivoDAOImple();
        arquivoDAO.save();
        arquivo.save();

        List<String> lista = new LinkedList<>();
        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");
        lista.add("Nome5");
        lista.add("Nome6");
        for (String nome : lista){
            System.out.println(nome);
        }

    }
}
