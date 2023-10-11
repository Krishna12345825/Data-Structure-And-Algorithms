package PracticeQuestion.Programming.Loops;

import java.util.Scanner;
/*
Write a program to print the first N multiples of either 3, 5 or 7.
*/



public class Q9MultiplesOfThreeFiveSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0; // To keep track of the number of multiples found
        int num = 1; // Starting number
        while (count < n) {
            if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
