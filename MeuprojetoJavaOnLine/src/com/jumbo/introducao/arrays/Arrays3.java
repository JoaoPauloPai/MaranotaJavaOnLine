package com.jumbo.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[]numeros2 = {1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i ++) {
            System.out.println("valores " + numeros2[i]);
        }
        for (int aux : numeros2){
            System.out.println(aux);
        }
    }
}
