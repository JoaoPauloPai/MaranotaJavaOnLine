package com.jumbo.javacore.Pacertions.teste;

public class AcertionsTeste {
    public static void main(String[] args) {
       // calculaSalario(-1000);
        diaSemana(10);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0);
    }

    public static void diaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Hoje é segunda feira");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                assert true;
        }

    }
}
