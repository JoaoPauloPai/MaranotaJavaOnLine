package com.jumbo.javacore.Oexepcion.runtimeexption.teste;

import java.io.*;

public class TryWithRessourcesTeste {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("Teste.txt"))) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

