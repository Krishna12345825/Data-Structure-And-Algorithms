package Tap.Tai.Q2_IfElse;

import java.util.Scanner;
/*
Write a Java program to find the largest number among two given integers.
*/

public class Q19LargesNumberOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n==m){
            System.out.println(m);
        }else if(n>m){
            System.out.println(n);
        }else if(m>n){
            System.out.println(m);
        }
    }
}
