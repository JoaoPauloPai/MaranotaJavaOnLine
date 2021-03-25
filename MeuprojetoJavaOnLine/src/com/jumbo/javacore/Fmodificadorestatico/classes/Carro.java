package com.jumbo.javacore.Fmodificadorestatico.classes;

public class Carro {
    //Velocidade limite de 240 km/h

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 210;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    //  public static double getVelocidadeLimite(){
    //     velocidadeLimite = velocidadeLimite;
    //  }

    public void imprime() {
        System.out.println("Carro modelo " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limoite " + velocidadeLimite);
        System.out.println("------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
