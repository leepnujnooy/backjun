package org.example;

public class Main {
    public static void main(String[] args) {

        String a = "hi";
        String b = "hi";
        String c = new String("hi");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));



        int aa = 4620;
        System.out.println((aa%1000)/500);
    }
}