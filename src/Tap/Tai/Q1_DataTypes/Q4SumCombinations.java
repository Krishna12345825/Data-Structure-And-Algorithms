package Tap.Tai.Q1_DataTypes;

// Write a program to print all sum combination of three numbers by taking two numbers at a time.

import java.util.Scanner;

public class Q4SumCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sum1 = m + n ;
        int sum2 = m + k ;
        int sum3 = n + k ;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
