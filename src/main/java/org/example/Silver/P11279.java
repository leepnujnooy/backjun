package org.example.Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11279 {

    static int length;
    static int temp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        length = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < length; i++) {
            temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(pq.poll()).append("\n");
                }
            }
            else{
                pq.add(temp);
            }

        }


        System.out.println(sb.toString());

    }
}
