package com.jumbo.javacore.Fmodificadorestatico.classes;

public class Cliente {
    //1 - Alocado espeço na memória para o objeto que será criado
    //2 - Cada atributo de classe é criado e inicializado com seus valores defalt
    //3 - Bloco de inicializaçõa é inicializado apenas 1 vez
    //4 - Caso tenha mais blocos de inicialização em uma mesma classe, será pela ordem
    private static int[] parceleas;

    {
        parceleas = new int[100];
        System.out.println("Bloco de inicializaão");
        System.out.println("Dentro ini");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i - 1 + " ");
        }
    }

    public static int[] getParceleas() {
        return parceleas;
    }

    public static void setParceleas(int[] parceleas) {
        Cliente.parceleas = parceleas;
    }
}
