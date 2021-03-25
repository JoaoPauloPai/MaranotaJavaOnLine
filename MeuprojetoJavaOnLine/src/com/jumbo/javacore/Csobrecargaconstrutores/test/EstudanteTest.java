package com.jumbo.javacore.Csobrecargaconstrutores.test;

import com.jumbo.javacore.Csobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Jose da Silva","783299",new double[]{4,5,6},"12/12/1967");
    estudante.imprime();
    }

}
