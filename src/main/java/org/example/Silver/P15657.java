package org.example.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class P15657 {


    private static int[] arr;
    private static boolean[] isVisit;
    private static int[] temp;
    private static int n,m;
    private static StringBuilder sb;

    void DFS(int depth){

        if(depth == m){
            for (int i : temp){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){


                temp[depth] = arr[i];

                DFS(depth+1);
                isVisit[i] = true;
                for (int j = i+1; j < n; j++) {
                    isVisit[j] = false;
                }
            }
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        isVisit = new boolean[n];
        temp = new int[m];
        sb = new StringBuilder();

        P15657 p15655 = new P15657();
        p15655.DFS(0);


        System.out.println(sb.toString());

    }
}