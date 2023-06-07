package org.example;

import java.util.LinkedList;

public class LinkedlistEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        System.out.println(list.removeLast());


        StringBuilder sb = new StringBuilder();
        sb.append(1+"\n");
        sb.append(2+"\n");
        System.out.println(sb.toString());

    }
}
