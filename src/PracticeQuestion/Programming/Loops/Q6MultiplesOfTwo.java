package PracticeQuestion.Programming.Loops;

import java.util.Scanner;

/*
Write a program to print all the multiples of 2 till N.
*/


public class Q6MultiplesOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=2; i<=n; i=i+2){
            System.out.print(i+" ");
        }
    }
}
