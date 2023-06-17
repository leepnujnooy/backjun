package org.example.Silver;

import java.util.Scanner;

public class P15651 {
    static int[] nums;
    static boolean[] isVisit;
    static StringBuilder sb;



    void DFS(int n, int m, int depth){
        if(depth == m){
            for(int i : nums){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){
                nums[depth] = i+1;
                DFS(n,m,depth+1);
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sb = new StringBuilder();
        nums = new int[m];
        isVisit = new boolean[n];

        P15651 p15651 = new P15651();
        p15651.DFS(n,m,0);
        System.out.println(sb.toString());

    }
}
