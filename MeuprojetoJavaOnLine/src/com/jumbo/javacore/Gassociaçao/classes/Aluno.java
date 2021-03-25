package com.jumbo.javacore.Gassociaçao.classes;

public class Aluno {
    private Seminario seminario;
    private Local local;
    private String nome;
    private int idade;
    private String sexo;

    public Aluno(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Aluno() {
    }

    public void imprimir() {
        System.out.println("-----------------------------");
        System.out.println(" Aluno nome : " + this.nome);
        System.out.println(" Idade      : " + this.idade);
        System.out.println(" Sexo       : " + this.sexo);
        if (seminario != null) {
            System.out.println(" Seminário Inscrito : " + this.seminario.getTitulo());
        } else {
            System.out.println("Aluno não inscrito em nenhum seminário");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
