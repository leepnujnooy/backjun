package org.example.Bronze;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if(w-x >= x || h-y >= y && x < h-y && y < w-x){
            System.out.println(Math.min(x,y));
        }else{
            System.out.println(Math.min(w - x, h - y));
        }


    }
}
