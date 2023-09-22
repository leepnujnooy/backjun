package org.example.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class P15664 {



    static StringBuilder sb;
    static int n,m;
    static boolean[] isVisit;
    static int[] temp;
    static int[] num;
    static String str = "";

    void DFS(int depth){
        if(depth == m){
            for (int i : temp) {
                sb.append(i).append(" ");
            }
            if(!str.contains(sb.toString())){
                str += sb.toString();
                str += "\n";
                sb.setLength(0);
                return;
            }
            else{
                sb.setLength(0);
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){
                temp[depth] = num[i];
                DFS(depth+1);
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P15664 p15663 = new P15664();
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
