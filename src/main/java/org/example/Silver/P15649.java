package org.example.Silver;


import java.util.Scanner;

//Back-Tracking
public class P15649 {


    static int[] arr;
    static boolean[] isVisit;

    void dfs(int n , int m , int depth){
        if(depth == m){//마지막 까지 간다면
            for(int i : arr){
                System.out.print(i + " ");//숫자입력
            }
            System.out.println();//줄바꿈처리
            return;//함수종료
        }

        for (int i = 0; i < n; i++) {
            if(!isVisit[i]){
                isVisit[i] = true;
                arr[depth] = i+1;
                dfs(n,m,depth+1);
                isVisit[i] = false; //백트래킹
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        isVisit = new boolean[n];
        P15649 p15649 = new P15649();
        p15649.dfs(n,m,0);



    }
}
