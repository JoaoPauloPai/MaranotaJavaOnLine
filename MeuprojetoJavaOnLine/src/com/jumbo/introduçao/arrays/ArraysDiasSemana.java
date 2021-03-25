package com.jumbo.introduçao.arrays;

public class ArraysDiasSemana {
    public static void main(String[] args) {
        String[] dias = new String[]{"Domingo","Segunda", "Terça","Quarta","Quinta","Sexta","Sábado"};
        for (String ref : dias){
            System.out.println("Os dias da semana : "+ ref);
        }
    }
}
