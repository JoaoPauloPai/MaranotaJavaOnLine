package com.jumbo.javacore.Dsobrecargametodos.test;

import com.jumbo.javacore.Dsobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jose da Silva", "123.344.455-90", 4590, "239037");
       // funcionario.indy("Jose da Silva", "123.344.455-90", 4590, "239037");
        funcionario.imprime();
    }
}
