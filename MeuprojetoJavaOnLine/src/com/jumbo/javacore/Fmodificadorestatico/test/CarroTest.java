package com.jumbo.javacore.Fmodificadorestatico.test;

import com.jumbo.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
      //  Carro.velocidadeLimite = 225;
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("AUDY", 270);
        Carro c3 = new Carro("COROLLA", 250);
        c1.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("#######################");
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
