package com.jumbo.introduçao.controledefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 15;
        String status;
        status = idade < 18 ? "Não Adulto":"Adulto";
        System.out.println(status);
    }
}
