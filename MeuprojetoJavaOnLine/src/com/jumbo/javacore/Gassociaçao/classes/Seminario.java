package com.jumbo.javacore.Gassociaçao.classes;

public class Seminario {
    private String titulo;
    private Aluno alunos;
    private Professor professor;
    private Seminario[] seminarios;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void imprime() {
        System.out.println("**** Seminários Cadastrados ****");
        System.out.println(" Título   : " + this.titulo);
        if (local != null) {
            System.out.println(" Endereço : " + this.local.getRua());
            System.out.println(" número   : " + this.local.getNumero());
            System.out.println(" Bairro   : " + this.local.getBairro());
            System.out.println(" Estado   : " + this.local.getEstado());
            System.out.println(" Cidade   : " + this.local.getCidade());
        } else {
            System.out.println("Seminário não tem endereço");
        }
        System.out.println("***** Professores ****");
        if (professor != null) {
            System.out.println("Professor     : " + this.professor.getNome());
            System.out.println("Especialidade : " + this.professor.getEspecialidade());
        } else {
            System.out.println("Professores não cadastrados.");
        }
        if (professor != null)   {
            System.out.println("Rua    : " + this.professor.getLocal().getRua());
            System.out.println("número : " + this.professor.getLocal().getNumero());
            System.out.println("Bairro : " + this.professor.getLocal().getBairro());
            System.out.println("Cidade : " + this.professor.getLocal().getCidade());
            System.out.println("Estado : " + this.professor.getLocal().getEstado());
        } else {
            System.out.println("Professores não tem endereços");
        }
        System.out.println("*** Alunos ***");
        if (alunos != null) {
                System.out.println(" Aluno nome  : " + this.alunos.getNome());
                System.out.println(" Aluno idade : " + this.alunos.getIdade());
                System.out.println(" Aluno sexo  : " + this.alunos.getSexo());
        } else {
            System.out.println("Alunos não cadastrados.");
        }
        if (alunos != null) {
            System.out.println(" Aluno Endereço  : " + this.alunos.getLocal().getRua());
        } else {
            System.out.println("Endereço do Aluno não cadastrado");
        }
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor getProfessor() {

        return professor;
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
