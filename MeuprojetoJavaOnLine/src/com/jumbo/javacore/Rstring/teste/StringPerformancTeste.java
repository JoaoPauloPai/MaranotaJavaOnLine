package com.jumbo.javacore.Rstring.teste;

public class StringPerformancTeste {
    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();
        concatString(1000);
        Long fim = System.currentTimeMillis();
        System.out.println("Tempo Gasto " + (fim - inicio) + " : tempo em milisegundos");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Gasto " + (fim - inicio) + " : tempo em milisegundos");
    }

    private static void concatString(int TAM) {
        String nome = " ";
        for (int i = 0; i < TAM; i++) {
            nome += i;
        }

    }

    private static void concatStringBuilder(int TAM) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TAM; i++) {
            sb.append(i);
        }
    }
}
