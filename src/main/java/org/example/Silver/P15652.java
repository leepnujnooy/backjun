package org.example.Silver;

import java.util.Scanner;

public class P15652 {
    static int[] nums;
    static boolean[] isVisit;
    static int n,m;
    static StringBuilder sb;


    void DFS(int n, int m, int depth){
        if(depth==m){
            for (int i : nums){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }//출력처리

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){

                nums[depth] = i+1;
                DFS(n,m,depth+1);
                isVisit[i] = true;
                for (int j = i+1; j < n; j++) {
                    isVisit[j] = false;
                }

            }
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        nums = new int[m];
        isVisit =new boolean[n];
        sb = new StringBuilder();

        P15652 p15652 = new P15652();

        p15652.DFS(n,m,0);

        System.out.println(sb.toString());


    }
}
