package com.jumbo.introduçao.controledefluxo;

public class ControleDeFluxoExercicio3 {
    public static void main(String[] args) {
        //imprimir todos os números pares de o até 100000
        int num = 100000;
        for (int i = 0; i <= num; i++){
            if (i%2==0){
                System.out.println("numeros pares   : " + i);
            }if (i%2!=0){
                System.out.println("numeros impares : " + i);
            }
        }

    }
}
