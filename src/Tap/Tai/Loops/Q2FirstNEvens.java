package Tap.Tai.Loops;

import java.util.Scanner;
/*
Write a program to print the first N even natural numbers.
*/

public class Q2FirstNEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(2 * i+" ");
        }
    }
}
