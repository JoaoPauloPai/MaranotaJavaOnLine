package com.jumbo.introduçao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 29;
        dias[0][1] = 31;
        dias[1][0] = 50;
        dias[1][1] = 55;
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("================================");
       for (int[] ref : dias){
           for (int dia : ref){
               System.out.println(dia);

           }
       }
    }
}
