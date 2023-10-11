package PracticeQuestion.Programming.DataTypes;

import java.util.Scanner;

// Write a program to find the product of 3 numbers.
public class Q3ProductofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long product = m * n * k;
        System.out.println(product);

    }
}
