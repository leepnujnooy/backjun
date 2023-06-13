package org.example.Silver;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class P4949 {

    //solution method
    public String check(String s){

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //input
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }

            //output
            if(s.charAt(i)==')' && !st.isEmpty()){
                if(st.peek() == '('){
                    st.pop();
                }
                else {
                    return "no";
                }
            }
            else if(s.charAt(i)==']' && !st.isEmpty()){
                if(st.peek() == '['){
                    st.pop();
                }
                else{
                    return "no";
                }
            }
            else if(s.charAt(i)==')' && st.isEmpty()){
                return "no";
            }
            else if(s.charAt(i)==']' && st.isEmpty()){
                return "no";
            }

        }//for

        if(st.isEmpty()){
            return "yes";
        }
        else{
            return "no";
        }
    }



    //main method
    public static void main(String[] args) {

        //Input value
        Scanner sc = new Scanner(System.in);
        String s = "";
        P4949 p4949 = new P4949();

        //until "." coming
        while(true){
                s = sc.nextLine();

                if(s.equals(".")){
                    break;
                }

                System.out.println(p4949.check(s));
        }

    }
}
