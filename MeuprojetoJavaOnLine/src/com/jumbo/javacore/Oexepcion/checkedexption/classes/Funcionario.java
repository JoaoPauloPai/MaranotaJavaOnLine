package com.jumbo.javacore.Oexepcion.checkedexption.classes;

import com.jumbo.javacore.Oexepcion.customexption.LoginInvalidoExpiton;

public class Funcionario extends PessoaP{

    public void salvar() throws LoginInvalidoExpiton {
try {
    System.out.println("erro");
}catch (Exception e){
    e.printStackTrace();
}

    }

}
