package org.example.Silver;

import java.util.Arrays;
import java.util.Scanner;

//backtracking
public class P15650 {

    static int[] nums;
    static boolean[] isVisit;


    void DFS(int n , int m , int depth){//4 2 0 > 4 2 1
        if(depth == m){// depth == 2 ?
            for(int i: nums){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }


        for (int i = 0; i < n; i++) {
            if (!isVisit[i]){
                isVisit[i]=true; //방문
                nums[depth] = i+1;
                DFS(n,m,depth+1);
                for (int j = i+1; j < n; j++) {
                    isVisit[j] = false;
                }
            }

        }

    }


    public static void main(String[] args) {
        P15650 p15650= new P15650();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        nums = new int[m];
        isVisit = new boolean[n];

        p15650.DFS(n,m,0);
    }
}
