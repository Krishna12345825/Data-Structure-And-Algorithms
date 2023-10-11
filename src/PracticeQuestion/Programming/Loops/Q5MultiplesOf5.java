package PracticeQuestion.Programming.Loops;

import java.util.Scanner;

/*
Write a program to print first N multiples of 5.
*/

public class Q5MultiplesOf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(5 * i+" ");
        }
    }
}
