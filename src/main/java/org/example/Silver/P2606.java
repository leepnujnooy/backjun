package org.example.Silver;

import java.util.Scanner;

public class P2606 {

    static int[][] graph;
    static boolean[] isVisit;
    static int count;

    public void DFS(int v){
        isVisit[v] = true;
        for (int i = 0; i < graph.length; i++) {
            if(!isVisit[i] && graph[v][i] == 1){
                count++;
                DFS(i);
            }
        }
    }


    public static void main(String[] args) {
        P2606 p2606 = new P2606();

        Scanner sc = new Scanner(System.in);
        int numOfCom = sc.nextInt();
        int numOfLine = sc.nextInt();
        graph = new int[numOfCom+1][numOfCom+1];
        isVisit = new boolean[numOfCom+1];

        for (int i = 0; i < numOfLine; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from][to] = graph[to][from] = 1;
        }

        int first = 1;
        p2606.DFS(first);

        System.out.println(count);

    }
}
