package com.jumbo.javacore.Hheranca.test;

import com.jumbo.javacore.Hheranca.classes.Endereco;
import com.jumbo.javacore.Hheranca.classes.Funcionario;
import com.jumbo.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
      //  Pessoa p = new Pessoa();
        Endereco end = new Endereco();

       // System.out.println("-----------primeira linha--------------");
       // System.out.println("---------------Pessoa-----------------");
      //  p.setNome("Gina");
       // p.setSobrenome("Silva");
      //  p.setCpf("12345");
        end.setRua("Rua Das Anturias");
        end.setBairro("Bairro São José");
      //  p.setEndereco(end);

        Funcionario f = new Funcionario();
        //System.out.println("------------------------------------------");
        f.setNome("Jose");
        f.setSobrenome("Gomes");
        f.setCpf("123390");
        f.setEndereco(end);
        f.setSalario(25980);







    }

}

