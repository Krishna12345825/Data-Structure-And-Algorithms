package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;
/*
String Length finder

input:
Hello World!
12



*/


public class Q2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        findLength(s);
    }

    static void findLength(String s){
        System.out.println(s.length());
    }
}
