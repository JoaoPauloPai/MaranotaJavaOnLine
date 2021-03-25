package com.jumbo.javacore.Bintroducaometodos.test;

import com.jumbo.javacore.Bintroducaometodos.classes.Professor;

public class ProfesssorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.numCPF ="8204203-89";
        prof.nome = "José da Silva";
        prof.matricula = 328943;
        prof.numRG = 47943002;
        Professor prof2 = new Professor();
        prof2.numCPF ="887430-90";
        prof2.nome = "Joana Chavethock";
        prof2.matricula = 434434;
        prof2.numRG = 900329;
        Professor prof3 = new Professor();
        prof3.numCPF ="433499-33";
        prof3.nome = "paulo Augusto";
        prof3.matricula = 1234566;
        prof3.numRG = 976568;


        prof2.imprime();
        prof.imprime();
        prof3.imprime();

    }
}
