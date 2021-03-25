package com.jumbo.introduçao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, doulble valor )
        // char valor vazio
        //boollean valor false
        //String valor null
        int i=0;
        String[] nomes = new String[5];
        nomes[0]="Maria";
        nomes[1]="José";
        nomes[2]="Antonio";
        nomes[3]="Paulo";
        nomes[4]="Keylli";
        String[] sobrenome = new String[5];
        sobrenome[0] = "Gotardo";
        sobrenome[1] = "Da Silva";
        sobrenome[2] = "Camargo";
        sobrenome[3] = "Gomes";
        sobrenome[4] = "Correa";
       /* for(int i = 0; i < nomes.length; i++) {
            int cont = i + 1;
            System.out.println( cont +" Nome = "+  nomes[i]+" "+ sobrenome[i]);
        }*/
        for (String aux : nomes){
            System.out.println( i +" Nome = "+  nomes[i]+" "+ sobrenome[i]);
            i ++;
        }
    }
}
