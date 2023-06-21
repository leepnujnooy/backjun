package org.example.Silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P15663 {



    static StringBuilder sb;
    static int n,m;
    static boolean[] isVisit;
    static int[] temp;
    static int[] num;
    static String str = "";
    static String tempLine = "";

    void DFS(int depth){
        if(depth == m){
            for (int i : temp) {
                tempLine += i + " ";
            }
            if(!str.contains(tempLine)){
                str += tempLine + "\n";
                tempLine = "";
                return;
            }
            else{
                tempLine = "";
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){
                isVisit[i] = true;
                temp[depth] = num[i];
                DFS(depth+1);
                isVisit[i] = false;
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P15663 p15663 = new P15663();
        n = sc.nextInt();
        m = sc.nextInt();
        isVisit = new boolean[n];
        sb = new StringBuilder();
        temp = new int[m];
        num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        p15663.DFS(0);

        System.out.println(str);

    }
}
