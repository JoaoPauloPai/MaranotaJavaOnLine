package com.jumbo.introducao.controledefluxo;

public class ControleDeFluxoExercicio {
    public static void main(String[] args) {
        double salaraio = 5679;
        double imposto = 0;
        if (salaraio <= 1000) {
            imposto = salaraio * 0.05;
        }else if (salaraio > 1000 && salaraio <=2000){
            imposto = salaraio * 0.1;
        }else if (salaraio > 2000 && salaraio <= 4000){
            imposto = salaraio * 0.15;
        }else if (salaraio > 5000){
            imposto = salaraio * 0.2;
        }else {
            System.out.println("Este codigo contem erro!");
        }
        System.out.println("O valor do imposto é R$ "+ imposto);
    }
}
