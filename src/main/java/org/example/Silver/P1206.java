package org.example.Silver;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//BFS DFS
public class P1206 {

    static int[][] graph;
    static boolean[] isVisit;
    static StringBuilder sb;

    public void DFS(int V){

        isVisit[V] = true;
        sb.append(V).append(" ");

        //recursive function
        for (int i = 1; i < graph.length; i++) {
            if(!isVisit[i] && graph[V][i] == 1){ //방문하지 않았다 && 간선이 존재한다
                DFS(i);
            }
        }

    }

    public void BFS(int V){

        isVisit[V] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(V); // 시작 정점을 queue 에 넣는다

        while(!q.isEmpty()){
            V = q.poll(); //큐 맨 앞의 숫자를 제거후 V에 할당
            sb.append(V).append(" ");

            for (int i = 1; i < graph.length; i++) {
                if(!isVisit[i] && graph[V][i] == 1){ //방문하지 않았다 && 간선이 존재한다.
                    q.add(i);
                    isVisit[i] = true;
                }
            }
        }

    }



    public static void main(String[] args) {

        //인스턴스화
        P1206 p1206 = new P1206();

        //입력 값 처리
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //정점의 개수
        int M = sc.nextInt(); //간선의 개수
        int V = sc.nextInt(); //탐색을 시작하는 정점의 번호
        graph = new int[N+1][N+1]; //그래프 생성

        //그래프 그리기
        for (int i = 0; i < M; i++) {
            int from = sc.nextInt(); //시작 정점
            int to = sc.nextInt(); //종료 정점
            graph[from][to] = graph[to][from] = 1; //양방향 간선 처리
        }


        //DFS process
        isVisit = new boolean[N+1];
        sb = new StringBuilder();
        p1206.DFS(V);
        System.out.println(sb.toString());

        //BFS process
        isVisit = new boolean[N+1];
        sb = new StringBuilder();
        p1206.BFS(V);
        System.out.println(sb.toString());
    }
}
