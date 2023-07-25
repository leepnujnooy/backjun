package org.example.Silver;

import java.util.Scanner;

public class P11724 {

    static int[][] graph;
    static boolean[] visit;
    static int vertex, edge;


    void depthFirstSearch(int val){

        //이미 방문했다면 나오기
        if(visit[val]) return;

        //방문처리
        visit[val] =true;


        for (int i = 1; i <= vertex; i++) {
            if(graph[val][i] == 1){
                depthFirstSearch(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt();
        edge = sc.nextInt();

        graph = new int[vertex+1][vertex+1];
        visit = new boolean[vertex+1];

        for (int i = 0; i < edge; i++) {
            // 시작점
            int start = sc.nextInt();

            // 끝점
            int end = sc.nextInt();

            // 양방향 간선이기 때문에 모두 +1
            graph[start][end] = graph[end][start] = 1;
        }


        int cnt = 0;
        P11724 p11724 = new P11724();
        for (int i = 1; i <= vertex ; i++) {
            if(!visit[i]){
                p11724.depthFirstSearch(i);
                cnt++;
            }
        }


        System.out.println(cnt);
    }
}









//        문제
//        방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
//        출력
//        첫째 줄에 연결 요소의 개수를 출력한다.