package com.jumbo.javacore.Sdatas.classes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
    public static void main(String[] args) {
        Locale lc = new Locale("pt", "br");
        Calendar c = Calendar.getInstance();
        c.set(2015, 11, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

    }
}
