package Tap.Tai.Q3_Loops;

import java.util.Scanner;
/*
Write a program to print first N multiples of 3.
*/


public class Q4MultiplesOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(3 * i+" ");
        }
    }
}
