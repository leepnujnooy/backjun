package org.example.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P15683 {

    static int height, width;
    static int[][] map;
    static boolean[][] visit;
    static int[] result = new int[4];



    void doCCTV1(int x, int y){

    }

    void doCCTV2(int x, int y){

    }

    void doCCTV3(int x, int y){

    }

    void doCCTV4(int x , int y){

    }

    void doCCTV5(int x, int y){

    }


    void findCCTV(int x, int y){


        if(map[x][y] == 0){
            findCCTV(x+1,y);
            findCCTV(x-1,y);
            findCCTV(x,y+1);
            findCCTV(x,y-1);
        }
        else if(map[x][y] == 1){
            doCCTV1(x,y);
        }
        else if(map[x][y] == 2){
            doCCTV2(x,y);
        }
        else if(map[x][y] == 3){
            doCCTV3(x,y);
        }
        else if(map[x][y] == 4){
            doCCTV4(x,y);
        }
        else if(map[x][y] == 5){
            doCCTV5(x,y);
        }




    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        height = Integer.parseInt(a[0]);
        width = Integer.parseInt(a[1]);

        map = new int[height][width];
        visit = new boolean[height][width];


        for (int i = 0; i < height; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < width; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
        br.close();





    }
}
