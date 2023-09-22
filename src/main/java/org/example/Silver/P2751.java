package org.example.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2751 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list2 = new ArrayList<>();

        int length = sc.nextInt();
        for (int i = 0; i < length ; i++) {
            int num = sc.nextInt();
            list2.add(num);
        }

        Collections.sort(list2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list2.size(); i++) {
            sb.append(list2.get(i))
                    .append("\n");
        }

        System.out.println(sb.toString());



    }
}
