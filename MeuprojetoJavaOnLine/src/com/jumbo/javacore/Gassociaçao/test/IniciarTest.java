package com.jumbo.javacore.Gassociaçao.test;

import com.jumbo.javacore.Gassociaçao.classes.*;

public class IniciarTest {
    public static void main(String[] args) {
        //alunos
        Aluno aluno1 = new Aluno("José da Silva", 23, "masculino");
        Aluno aluno2 = new Aluno("Maria ", 22, "feminino");
        //seminarios
        Seminario sem1 = new Seminario("O Primeiro seminário");
        Seminario sem2 = new Seminario("O segundo Seminário");
        //Profesdsores
        Professor prof1 = new Professor("Amilton", "Portugues");
        Professor prof2 = new Professor("Antonio", "TI");
        //Endereços
        Local loc1 = new Local("Avenida da Acacia", 563, "São Mateus", "Mato Grosso", "Cuibá");
        Local loc2 = new Local("R das Imbaubas", 4356, "Centro", "Paraná", "Curitiba");
        //Vinculos
        sem1.setLocal(loc1);
        sem1.setAlunos(aluno1);
        aluno2.setSeminario(sem1);
        prof1.setSeminario(sem1);
        prof1.setLocal(loc1);
        aluno1.setLocal(loc2);
        sem1.setProfessor(prof1);
        sem2.setLocal(loc2);
        sem1.imprime();
        sem2.imprime();
         prof1.imprimir();
         prof2.imprimir();
         aluno1.imprimir();
         aluno2.imprimir();
    }
}
