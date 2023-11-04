package Tap.Tai.IfElse;

import java.util.Scanner;

/*
Check if a given number is a three-digit number and also a multiple of 10.
*/
public class Q8ThreeDigitNumberAndAMultipleOf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= 100 && n <= 999 && n % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
