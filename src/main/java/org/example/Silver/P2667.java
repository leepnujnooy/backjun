package org.example.Silver;


import java.util.*;

//DFS BFS
public class P2667 {

    static int[][] graph; //그래프
    static boolean[][] isVisit; //방문처리
    static int count; //총 단지수
    static int x,y = 0; //x와 y가 size를 넘거나, 0보다 작아지면 false 리턴
    static int size;
    static int numOfHouse;


    boolean DFS(int x, int y){

        if(x>=size || x<=-1 || y>=size || y<=-1){ //size와 같거나 커서는 안되는 이유 : size 가 7인경우, 인덱스 6이 의미하는바가 7이기때문
            return false;
        }

        if(graph[x][y] == 1 && !isVisit[x][y]){
            numOfHouse++;
            isVisit[x][y]=true;
            DFS(x+1,y);//우
            DFS(x,y+1);//상
            DFS(x-1,y);//좌
            DFS(x,y-1);//하
            return true;
        }


        return false;
    }






    public static void main(String[] args) {
        P2667 p2667 = new P2667();

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        sc.nextLine();
        graph = new int[size][size];
        isVisit = new boolean[size][size];

        List<Integer> list= new ArrayList<>();

        //graph 값 받아오기
        for (int i = 0; i < size; i++) {
            String[] temp = sc.nextLine().split("");
            for (int j = 0; j < temp.length; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);

            }
        }


        //graph 상 하 좌 우 dfs

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(p2667.DFS(i,j)){
                    count++;
                    list.add(numOfHouse);
                    numOfHouse=0;
                }
            }
        }
        System.out.println(count);
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
