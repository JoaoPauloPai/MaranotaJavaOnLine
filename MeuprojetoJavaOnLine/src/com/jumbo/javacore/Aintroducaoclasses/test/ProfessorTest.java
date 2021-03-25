package com.jumbo.javacore.Aintroducaoclasses.test;

import com.jumbo.javacore.Aintroducaoclasses.classes.Professor;
public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Joaquim da Silva";
        professor.matricula = 1234;
        professor.numCPF = "213.443.221-67";
        professor.numRG = 64838;
        System.out.println("Nome      : "+ professor.nome);
        System.out.println("Matricula : "+ professor.matricula);
        System.out.println("CPF       : "+ professor.numCPF);
        System.out.println("RG        : "+ professor.numRG);
    }
}
