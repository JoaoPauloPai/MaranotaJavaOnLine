package com.jumbo.javacore.Bintroducaometodos.test;

import com.jumbo.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String... args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(10, 5, "j");
        calc.divideDoisNumeros();
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println("Voltando para a classe test");
        int re = calc.calculadoraNumeros(10, 5);
        System.out.println("Valor De retorno " + re);
        int[] numeros = {1,1};
        calc.somaArray(numeros);
    }
}
