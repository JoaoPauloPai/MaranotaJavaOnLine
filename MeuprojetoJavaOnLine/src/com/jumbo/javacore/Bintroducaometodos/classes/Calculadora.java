package com.jumbo.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }
    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }
    public void multiplicaDoisNumeros(int num1, int num2, String nome) {
        System.out.println(num1 * num2 + nome);
    }
    public void divideDoisNumeros() {
        System.out.println(5 / 5);
    }
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            double re = num1 / num2;
            return;
        }
        System.out.println("*Erro dividir por Zero");
    }
    public int calculadoraNumeros(int num1, int num2) {
        if (num2 != 9) {
            int res = num1 * num2;
            return res;
        }
        System.out.println("O numero 9");
        return 0;
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do codigo Altera dois números");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
          soma += num;
        }
        System.out.println(soma);

    }
}