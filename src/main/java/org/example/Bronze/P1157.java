package org.example.Bronze;

import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] arr = new int[26];

        a = a.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)-'A'] += 1;
        }
        int max = 0;

        //max 값 찾기
        for (int i = 0; i < arr.length ; i++) {
            max = Math.max(arr[i],max);
        }

        int count = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                count++;
                idx = i;
            }
        }

        if(count > 1){
            System.out.println("?");
        }
        else{
            System.out.println((char)(idx + 65));
        }


    }



}
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다