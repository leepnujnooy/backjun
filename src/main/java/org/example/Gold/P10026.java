package org.example.Gold;

import java.util.Scanner;

public class P10026 {

    static String[][] map;
    static boolean[][] isVisit;

    static int common,jaeJun = 0;
    static int size;

    boolean isInArea(int x, int y){
        return x < size && x >= 0 && y < size && y >= 0;
    }

    boolean redDFS(int x, int y){
        if(!isInArea(x,y)){
            return false;
        }

        if(map[x][y].equals("R") && !isVisit[x][y]){
            isVisit[x][y] = true;
            redDFS(x+1,y);
            redDFS(x,y+1);
            redDFS(x-1,y);
            redDFS(x,y-1);
            return true;
        }
        return false;
    }

    boolean greenDFS(int x, int y){
        if(!isInArea(x,y)){
            return false;
        }

        if(map[x][y].equals("G") && !isVisit[x][y]){
            isVisit[x][y] = true;
            greenDFS(x+1,y);
            greenDFS(x,y+1);
            greenDFS(x-1,y);
            greenDFS(x,y-1);
            return true;
        }
        return false;
    }
    boolean blueDFS(int x, int y){
        if(isInArea(x,y)){
            return false;
        }

        if(map[x][y].equals("B") && !isVisit[x][y]){
            isVisit[x][y] = true;
            blueDFS(x+1,y);
            blueDFS(x,y+1);
            blueDFS(x-1,y);
            blueDFS(x,y-1);
            return true;
        }
        return false;
    }



    boolean jaeJunDFS(int x, int y){
        if(!isInArea(x,y)){
            return false;
        }

        if((map[x][y].equals("G") || map[x][y].equals("R")) && !isVisit[x][y]){
            isVisit[x][y] = true;
            jaeJunDFS(x+1,y);
            jaeJunDFS(x,y+1);
            jaeJunDFS(x-1,y);
            jaeJunDFS(x,y-1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        P10026 p10026 = new P10026();
        Scanner sc = new Scanner(System.in);
        size = Integer.parseInt(sc.nextLine());
        map = new String[size][size];
        isVisit = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            String[] temp = sc.nextLine().split("");
            for (int j = 0; j < temp.length; j++) {
                map[i][j] = temp[j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(p10026.jaeJunDFS(i,j) || p10026.blueDFS(i,j)){
                    jaeJun++;

                }
            }
        }

        isVisit = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(p10026.redDFS(i,j) || p10026.blueDFS(i,j) || p10026.greenDFS(i,j)){
                    common++;

                }
            }
        }


        System.out.printf("%d %d",common,jaeJun);

    }

}
