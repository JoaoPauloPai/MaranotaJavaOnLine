package com.jumbo.javacore.Sdatas.teste;

import java.util.Calendar;
import java.util.Date;

public class ManupulacaoDatasTeste {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR,24);
      //  c.add(Calendar.);
        Date data2 = c.getTime();
        System.out.println(data2);


    }
}
