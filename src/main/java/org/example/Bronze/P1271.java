package org.example.Bronze;

import java.util.Scanner;
import java.math.BigInteger;

public class P1271 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        in.close();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

    }
}