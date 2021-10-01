package com.jumbo.javacore.Sdatas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
    public static void main(String[] args) {
        Locale localYti = new Locale("it", "VA");
        Locale localBra = new Locale("pt", "BR");
        Locale localSuica = new Locale("it", "SH");
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.NOVEMBER, 10);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localYti);
        System.out.println(df.format(c.getTime()));
        // System.out.println(df2.format(c.getTime()));

    }
}
