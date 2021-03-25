package com.jumbo.javacore.Bintroducaometodos.test;

import com.jumbo.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.setNome("José da Silva");
        aluno.setIdade(28);
        aluno.setNotas(new double[]{80.9, 93.9, 79.});
        aluno.imprimeNotasAluno();
        aluno.mediaAlunos();
    }
}
