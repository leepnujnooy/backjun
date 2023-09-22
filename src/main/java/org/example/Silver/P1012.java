package org.example.Silver;

import java.util.Scanner;

public class P1012 {

    static int[][] map;
    static boolean[][] isVisit;
    static int count;
    static int width,height;


    boolean DFS(int x, int y){
        if(x >= width || x<0 || y>=height || y<0){
            return false;
        }

        if(!isVisit[x][y] && map[x][y] == 1){
            isVisit[x][y] = true;
            DFS(x+1,y);
            DFS(x-1,y);
            DFS(x,y+1);
            DFS(x,y-1);
            return true;
        }

        return false;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P1012 p1012 = new P1012();
        int caseNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < caseNum; i++) {
            width = sc.nextInt();
            height = sc.nextInt();
            int cabbage = sc.nextInt();
            map = new int[width][height];
            isVisit = new boolean[width][height];

            for (int j = 0; j < cabbage; j++) {
                map[sc.nextInt()][sc.nextInt()] = 1;
            }

            for (int j = 0; j < width; j++) {
                for (int k = 0; k < height; k++) {
                    if(p1012.DFS(j,k)){
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
