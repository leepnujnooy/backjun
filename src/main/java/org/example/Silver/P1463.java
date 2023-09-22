package org.example.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1463 {




    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        int[] dp = new int[val+1];


        dp[1] = 0;
        for (int i = 2; i < val+1; i++) {
            dp[i] = dp[i-1] + 1;
            if(i%2==0){
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
            }
            if(i%3==0){
                dp[i] = Math.min(dp[i/3]+1,dp[i]);
            }
        }
        System.out.println(dp[val]);
    }
}
