package com.jumbo.javacore.Sdatas.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dft = new  DateFormat[6];
        dft[0] = DateFormat.getInstance();
        dft[1] = DateFormat.getDateInstance();
        dft[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dft[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dft[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dft[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dft){
            System.out.println(df.format(c.getTime()));
        }
    }
}
