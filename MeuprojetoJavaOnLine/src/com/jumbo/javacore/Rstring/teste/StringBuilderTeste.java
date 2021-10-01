package com.jumbo.javacore.Rstring.teste;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String s = "Os amantes do código.";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Os amantes do código");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(2,'L'));
    }
}
