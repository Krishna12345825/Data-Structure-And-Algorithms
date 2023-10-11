package PracticeQuestion.Programming.Loops;

import java.util.Scanner;
/*
Write a program to print the first N natural numbers.
*/
public class Q1FirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
