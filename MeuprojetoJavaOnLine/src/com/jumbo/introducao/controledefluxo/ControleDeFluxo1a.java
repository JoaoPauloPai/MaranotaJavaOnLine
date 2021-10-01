package com.jumbo.introducao.controledefluxo;

public class ControleDeFluxo1a {
    public static void main(String[] args) {
        int temperatura = 100;
        String media;
        if (temperatura <= 20) {
            media = "muito Baixo o nivel";
        } else if (temperatura > 20 && temperatura < 40) {
            media = "Nível Controlado";
        } else if (temperatura > 40 && temperatura < 60) {
            media = "Nivel meio Alto";
        } else if (temperatura > 60 && temperatura < 100) {
            media = " Nivel Auto";
        } else {
            media = "Nivel muito alto";
        }
        System.out.println("Medidas de cuidados " + media);
    }
}
