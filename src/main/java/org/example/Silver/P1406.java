package org.example.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 받아오기 abcd
        String line = br.readLine();

        //반복 횟수 받아오기 3
        int times = Integer.parseInt(br.readLine());

        //문자열 담을 StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(line);


        //cursor 위치 정하기 4 abcd*
        int cursorLocation = sb.length();


        //처리 하기
        for (int i = 0; i < times ; i++) {
            //명령 값 받기
            String temp = br.readLine();

            if(temp.contains("L")){//L이면 커서를 왼쪽으로 이동
                if(cursorLocation != 0){ //0이 아니면
                    cursorLocation--;
                }
            }
            else if(temp.contains("D")){ //D이 커서를 오른쪽으로 이동
                if(cursorLocation != sb.length()){
                    cursorLocation++;
                }
            }
            else if(temp.contains("B")){ //B면 커서 왼쪽의 문자열을 삭제 , 이때 커서위치도 이동?
                if(cursorLocation != 0){
                    sb.deleteCharAt(cursorLocation-1);
                    cursorLocation--;
                }
            }
            else if(temp.contains("P")){ // p면 커서 옆에 인서트 , 인서트했으니 커서위치++
                sb.insert(cursorLocation,temp.split(" ")[1]);
                cursorLocation++;
            }
        }

        System.out.println(sb.toString());

    }
}
