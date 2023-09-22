package org.example.Silver;

import java.util.Scanner;

public class P11725 {

    static int[][] graph;
    static boolean[] node;
    static int vertex;




    void dfs(int val){
        if(node[val])return;
        node[val] = true;

        for (int i = vertex; i > 1; i--) {
            if(node[val] && graph[val][i] == 1){
                System.out.println(i);
                node[val]= false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt();
        graph = new int[vertex+1][vertex+1];
        node = new boolean[vertex+1];

        for (int i = 0; i < vertex-1; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph[start][end]=graph[end][start]= 1;

        }
        P11725 p11725 = new P11725();

        for (int i = 2; i <= vertex; i++) {
            p11725.dfs(i);
        }


    }
}
//루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.
//
//출력
//첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.
//예제 입력
//7
//1 6
//6 3
//3 5
//4 1
//2 4
//4 7
//예제 출력
//4
//6
//1
//3
//1
//4

