package com.jumbo.javacore.Lclassesabstratas.teste;

import com.jumbo.javacore.Lclassesabstratas.classes.Funcionario;
import com.jumbo.javacore.Lclassesabstratas.classes.Gerente;
import com.jumbo.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Vendedor v = new Vendedor("Joao","121234-89",1500,5000);
        Gerente g = new Gerente("Maria","203030-4",2000);

        v.calcularSalario();
        g.calcularSalario();
        System.out.println(v);
        System.out.println("---------------------");
        System.out.println(g);
    }
}
