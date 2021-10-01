package com.jumbo.introducao.controledefluxo;

public class ControleDeFluxoExercio2 {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil!!");
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }
    }
}
