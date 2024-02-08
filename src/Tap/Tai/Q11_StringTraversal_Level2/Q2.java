package Tap.Tai.Q11_StringTraversal_Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        upperCaseAsciiCheck(n);
    }

    static void upperCaseAsciiCheck(int n){
        if (n >= 65 && n<= 90){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
