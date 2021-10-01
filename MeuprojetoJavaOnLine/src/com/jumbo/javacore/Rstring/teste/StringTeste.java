package com.jumbo.javacore.Rstring.teste;

import java.util.Locale;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "José";
        String sobrenome = new String(" Gomes");

        System.out.println(nome + sobrenome);


        String nome2 = "anTonio";
        String nome3 = "ANTONIO";
        String nome4 = "0123456789";

        System.out.println(nome2.charAt(0));
        System.out.println("É igual ? " +nome2.equals(nome3));
        System.out.println("É igual ? " +nome2.equalsIgnoreCase(nome3));
        System.out.println("Tamanho String : " +nome2.length());
        System.out.println(nome2.replace("a","A"));
        System.out.println(nome2.toLowerCase());
        System.out.println(nome2.toUpperCase());
        System.out.println(nome4.substring(3,5));

    }
}