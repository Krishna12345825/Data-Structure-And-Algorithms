package Tap.Tai.IfElse;

import java.util.Scanner;

/*
Check if a given number is the ASCII value of a numeric character or not.
*/


public class Q15NumberASCIICheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 48 && n <= 57) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
