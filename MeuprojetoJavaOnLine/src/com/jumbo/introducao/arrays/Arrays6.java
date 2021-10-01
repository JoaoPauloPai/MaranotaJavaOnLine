package com.jumbo.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];//Diferentes formas de inicializar um array
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];
        int cont = 0;
        for (int[] aux : dias){
            int n = 0;
            for (int num : aux){
                System.out.println("Numero : "+cont+":"+ n +":"+"Valor = "+num);
                n++;
            }
            cont ++;
        }
    }
}
