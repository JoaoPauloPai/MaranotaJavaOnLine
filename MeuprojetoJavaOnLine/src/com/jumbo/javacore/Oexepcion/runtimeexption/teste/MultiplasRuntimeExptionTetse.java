package com.jumbo.javacore.Oexepcion.runtimeexption.teste;

import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExptionTetse {

    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do bloco ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do bloco IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do bloco ArithmeticException");
        }
        try {
            //ralvezLanceExption();
        }catch (Exception e){
             e.printStackTrace();
        }
    }

    private static void ralvezLanceExption() {
    }

}
