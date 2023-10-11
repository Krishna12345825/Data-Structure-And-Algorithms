package TapDSA.Programming.IfElse;

import java.util.Scanner;
/*
Write a Java program to find the smallest number among two given integers.
*/
public class Q22SmallestNumberOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int smallestNumber = Math.min(n, m);
        System.out.println(smallestNumber);
    }
}

