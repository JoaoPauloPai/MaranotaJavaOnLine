package com.jumbo.javacore.Gassociacao.classes;

public class Professor {
    private Seminario seminario;
    private Local local;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void imprimir() {
        System.out.println("Professor " + this.nome);
        System.out.println("Especialidade " + this.especialidade);
        if (seminario != null) {
            System.out.println("Seminario " + this.seminario.getTitulo());
        } else {
            System.out.println("Professor não inscrito em seminário");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
