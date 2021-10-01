package com.jumbo.javacore.Oexepcion.runtimeexption.teste;

import javax.crypto.spec.PSource;

public class ExeptionTeste {
    public static void main(String[] args) {
        //ArithmeticException
          int a = 10 / 0;
          System.out.println(a);

      // ArrayIndexOutOfBoundsException
         int [] b = new int[2];
         System.out.println(b[2]);
    }

}
