package Tap.Tai.Q3Loops;

import java.util.Scanner;
/*
Write a program to print the first N odd natural numbers.
*/


public class Q3FirstNOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print((2 * i)-1+" ");
        }
    }
}
