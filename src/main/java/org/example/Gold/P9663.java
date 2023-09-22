package org.example.Gold;


import java.util.Scanner;

public class P9663 {
    static int[][] map;
    static boolean[][] isVisit;
    static int size;
    static int count;

    void DFS(int x){

        if(x == size){
            count++;
            return;
        }




    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        map = new int[size][size];
        isVisit = new boolean[size][size];

    }
}
