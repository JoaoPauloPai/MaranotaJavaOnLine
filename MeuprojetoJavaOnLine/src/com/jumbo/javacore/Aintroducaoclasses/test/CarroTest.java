package com.jumbo.javacore.Aintroducaoclasses.test;

import com.jumbo.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "JLH-2827";
        carro.velocidadeMaxima = 185.91f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
