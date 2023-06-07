package org.example.Silver;

import java.util.LinkedList;
import java.util.Scanner;

public class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1 ; i <= num; i++) {
            list.add(i);
        }

        for (int i = 1; i <= num*2; i++) {
            if(list.size() != 1){
                if(i % 2 != 0){
                    System.out.println("삭제된 카드 "+list.getFirst());
                    list.removeFirst();
                    System.out.println("리스트 "+list);
                }
                else{
                    list.addLast(list.getFirst());
                    System.out.println("맨 밑에 놓인 카드 "+list.getLast());
                    list.removeFirst();
                    System.out.println("리스트 "+list);
                }
            }
            else{
                break;
            }
        }

        System.out.println(list.getLast());

    }
}
