package com.jumbo.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    //1 - Alocado espeço na memória para o objeto que será criado
    //2 - Cada atributo de classe é criado e inicializado com seus valores defalt
    //3 - Bloco de inicializaçõa é inicializado
    //4 -
    private int[] parceleas ;
    {
        parceleas = new int[100];
        System.out.println("Bloco de inicializaão");
        System.out.println("Dentro ini");
        for (int i=1; i<=100;i++){
            System.out.print(i - 1 + " ");
        }
    }
    public Cliente(){
        System.out.println("\nDentro do construtor");
        for (int parcela : this.getParceleas()){
            System.out.print(parcela + " ");
        }
    }

    public int[] getParceleas() {
        return parceleas;
    }

    public void setParceleas(int[] parceleas) {
        this.parceleas = parceleas;
    }
}
