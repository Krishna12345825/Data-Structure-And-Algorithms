package PracticeQuestion.Programming.DataTypes;

import java.util.Scanner;

// Write a program to add three integer numbers.
public class Q2AddingThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int m = scanner.nextInt();
        int n  = scanner.nextInt();
        int k = scanner.nextInt();
        int sum  = m + n + k;
        System.out.println(sum);
    }
}
