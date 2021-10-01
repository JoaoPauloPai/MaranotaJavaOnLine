package com.jumbo.javacore.Oexepcion.customexption.teste;

import com.jumbo.javacore.Oexepcion.customexption.LoginInvalidoExpiton;

public class CustomExptionteste {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoExpiton loginInvalidoExpiton) {
            loginInvalidoExpiton.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoExpiton {
        String usuario = "jos";
        String senha = "123";
        String usuarioDigitado = "jose";
        String senhaDigitada = "123";

        if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)) {
            throw new LoginInvalidoExpiton();
        }else {
            System.out.println("Usuario logado!");
        }
    }

}
