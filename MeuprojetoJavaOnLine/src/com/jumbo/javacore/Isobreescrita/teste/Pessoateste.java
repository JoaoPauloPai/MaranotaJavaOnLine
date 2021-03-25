package com.jumbo.javacore.Isobreescrita.teste;

import com.jumbo.javacore.Isobreescrita.classes.Pessoa;

public class Pessoateste  {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("Joaquim");
        p.setIdade(22);

        Pessoa p2 = new Pessoa();
        p2.setNome("Maria Conceicao");
        p2.setIdade(200);



        System.out.println(p);
        System.out.println(p2);

    }
}
