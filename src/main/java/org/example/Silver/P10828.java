package org.example.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //반복 횟수
        int length = Integer.parseInt(br.readLine());

        //Stack 선언
        Stack<Integer> st = new Stack<>();

        //StringBuilder 선언
        StringBuilder sb = new StringBuilder();

        //처리
        for (int i = 0; i < length; i++) {
            String line = br.readLine();
            if(line.contains("push")){
                st.push(Integer.parseInt(line.split(" ")[1]));
            }
            else if(line.equals("top")){
                sb.append(!st.isEmpty() ? st.peek() : -1).append("\n");
            }
            else if(line.equals("pop")){
                sb.append(!st.isEmpty() ? st.pop() : -1).append("\n");
            }
            else if(line.equals("size")){
                sb.append(st.size()).append("\n");
            }
            else if(line.equals("empty")){
                sb.append(st.isEmpty() ? 1 : 0).append("\n");
            }
        }

        System.out.println(sb.toString());

    }
}
