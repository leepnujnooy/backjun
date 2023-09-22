package org.example.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1026 {

    public int Solution() {
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Integer[] a = new Integer[length];
        Integer[] b = new Integer[length];

        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            answer = answer + a[i]*b[i];

        }

        return answer;
    }





    public static void main(String[] args)  {
        P1026 p1026 = new P1026();
        System.out.println(p1026.Solution());
    }
}
