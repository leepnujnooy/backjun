package org.example.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class P15654 {


    static int[] arr;
    static boolean[] isVisit;
    static int[] temp;
    static int n,m;


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
                isVisit[i]= false;


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

        P15654 p15654 = new P15654();
        p15654.DFS(0);


    }
}
