package com.jumbo.javacore.Bintroducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprimeNotasAluno() {
        System.out.println("Nome do Aluno  : " + this.nome);
        System.out.println("Idade do Aluno : " + this.idade);
        for (double nota : notas) {
            System.out.print("Nota :" + nota + " ");
        }
    }

    public void mediaAlunos() {
        if (notas == null) {
            System.out.println(" ");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / notas.length;
        if (media > 60.0) {
            this.aprovado = true;
            System.out.println("\nMédia Final :" + media);
            System.out.println("Parabéns !!! Você foi Aprovado!");
        } else {
            this.aprovado = false;
            System.out.println("Mádia Final :" + media);
            System.out.println("Você Foi reprovado!");
            System.out.println("Estude e tente novamente.");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovadoAprovado() {

        return this.aprovado;


    }
}
