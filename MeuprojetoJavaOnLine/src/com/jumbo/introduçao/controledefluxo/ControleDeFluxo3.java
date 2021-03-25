package com.jumbo.introduçao.controledefluxo;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        //variaveis válidas
        //int, char, byte, enum, short e String
        String dia = "7";
        char sexo = 'G';
        switch (dia) {
            case "1":
                System.out.println("Domingo!");
                break;
            case "2":
                System.out.println("Segunda!");
                break;
            case "3":
                System.out.println("Terça!");
                break;
            case "4":
                System.out.println("Quarta!");
                break;
            case "5":
                System.out.println("Quinta!");
                break;
            case "6":
                System.out.println("Sexta!");
                break;
            case "7":
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("Opcão Invalida!!");
                break;


        }
        switch (sexo){
            case 'F':
                System.out.println("Sexo Feminino.");
                break;
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            default:
                System.out.println("Opção Invalida! \n");
                System.out.println("Tente Novamente");

        }
    }
}
