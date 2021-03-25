package com.jumbo.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Transportavel{
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;
    private double precoFinalFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete +
                ", precoFinalFrete=" + precoFinalFrete +
                '}';
    }

    public double getPrecoFinalFrete() {
        return precoFinalFrete;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    @Override
    public void calculaImposto() {
       precoFinal = this.preco + (this.preco * IMPOSTO);

    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
        this.precoFinalFrete = valorFrete + precoFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
