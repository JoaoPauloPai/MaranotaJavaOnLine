package com.jumbo.javacore.Aintroducaoclasses.test;
import com.jumbo.javacore.Aintroducaoclasses.classes.Estudante;
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "Joao Paulo";
        joao.idade = 15;
        joao.matricula = 12;
        System.out.println("Aluno nome: " + joao.nome);
        System.out.println("Aluno matricula: " + joao.matricula);
        System.out.println("Aluno idade: " + joao.idade);
    }
}
