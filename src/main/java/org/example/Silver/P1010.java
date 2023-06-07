package org.example.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1010 {
    public BigInteger[] getAnswers() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        BigInteger[] answers = new BigInteger[times];

        for (int i = 0; i < times; i++) {
            String[] temp = br.readLine().split(" ");
            // 2 3
            int leftSide = Integer.parseInt(temp[0]);
            int rightSide = Integer.parseInt(temp[1]);

            // 3C2
            answers[i] = getCombination(rightSide,leftSide);
            
        }
        return answers;
    }


    public BigInteger getCombination(int right , int left){

        //3C2
        //3*2 분자
        //---
        //2*1 분모
        BigInteger bi1 = BigInteger.valueOf(right);
        BigInteger bi2 = BigInteger.valueOf(left);

        for (int i = 0; i < left; i++) {
            bi1.multiply(bi1.subtract(BigInteger.valueOf(1)));
            bi2.multiply(bi2.subtract(BigInteger.valueOf(1)));
        }


        return bi1.divide(bi2);
    }

    public static void main(String[] args) throws IOException {
        P1010 p1010 = new P1010();
        BigInteger[] temp = p1010.getAnswers();
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

    }
}