package org.example.Silver;

import java.io.*;
import java.util.LinkedList;
public class P18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        //값을 넣을 리스트생성
        LinkedList<Integer> list = new LinkedList<>();

        //값을 저장할 스트링빌더 생성
        StringBuilder sb = new StringBuilder();


        //1차원적으로 풀기..
        for (int i = 0; i < length ; i++) {
            String command = br.readLine();
            if(command.contains("push")){
                list.add(Integer.parseInt(command.split(" ")[1]));
            } else if (command.contains("front")) {
                if(list.size() != 0){
                    sb.append(list.getFirst()).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (command.contains("pop")) {
                if(list.size() != 0){
                    sb.append(list.removeFirst()).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (command.contains("size")) {
                sb.append(list.size()).append("\n");
            } else if (command.contains("empty")) {
                sb.append(list.isEmpty() ? 1 : 0).append("\n");
            } else if (command.contains("back")) {
                if(list.size() != 0){
                    sb.append(list.getLast()).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb.toString());



    }
}