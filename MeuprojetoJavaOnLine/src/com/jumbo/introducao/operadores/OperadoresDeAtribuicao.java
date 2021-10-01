package com.jumbo.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        //-=, +=, *=, /+
        int salario = 1000;
        salario %= 10;
        System.out.println("O salario total é R$ "+salario);
    }
}
