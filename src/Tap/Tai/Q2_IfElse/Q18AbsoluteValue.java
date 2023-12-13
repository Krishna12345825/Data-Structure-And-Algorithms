package Tap.Tai.Q2_IfElse;

import java.util.Scanner;

/*
Write a program to find the absolute value of a given integer.
*/


public class Q18AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int absoluteValue = Math.abs(n);
        System.out.println(absoluteValue);
    }
}
