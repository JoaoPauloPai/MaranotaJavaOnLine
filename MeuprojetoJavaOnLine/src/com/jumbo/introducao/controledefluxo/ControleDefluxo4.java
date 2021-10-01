package com.jumbo.introducao.controledefluxo;

public class ControleDefluxo4 {
    public static void main(String[] args) {
        int contador = 6;
        while (contador < 10){ System.out.println(contador);
            contador ++;
        }do {
            System.out.println("Laço 'do'" + contador);
        }while (contador > 10);
            System.out.println("Segundo wille!"+ contador);
            //contador = 19;

        for (int i = 0; i < 10; i ++){
            System.out.println("O valor de i : "+ i);
        }

    }
}
