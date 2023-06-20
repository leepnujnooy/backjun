package org.example.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class P15655 {


    private static int[] arr;
    private static boolean[] isVisit;
    private static int[] temp;
    private static int n,m;


    void DFS(int depth){

        if(depth == m){
            for (int i : temp){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){
                isVisit[i]= true;

                temp[depth] = arr[i];

                DFS(depth+1);
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

        P15655 p15655 = new P15655();
        p15655.DFS(0);


    }
}