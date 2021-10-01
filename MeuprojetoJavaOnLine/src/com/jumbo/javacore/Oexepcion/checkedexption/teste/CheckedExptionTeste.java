package com.jumbo.javacore.Oexepcion.checkedexption.teste;

import com.jumbo.javacore.Oexepcion.checkedexption.classes.Leitor1;
import com.jumbo.javacore.Oexepcion.checkedexption.classes.Leitor2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExptionTeste {

    public static void main(String[] args) {

        lerArquivo();

    }

    public static void lerArquivo() {

        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (Exception e) {
           e.printStackTrace();
        }
    }


}





