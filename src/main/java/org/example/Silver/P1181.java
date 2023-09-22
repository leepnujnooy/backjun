package org.example.Silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            list.add(sc.nextLine());
        }

        //중복제거
        List<String> noRepList = new ArrayList<>();
        for (String i : list) {
            if(!noRepList.contains(i)){
                noRepList.add(i);
            }
        }






        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < noRepList.size(); i++) {
            sb.append(noRepList.get(i)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
