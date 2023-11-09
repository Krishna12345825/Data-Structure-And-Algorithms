package Tap.Tai.Q2IfElse;

import java.util.Scanner;
/*
Check whether the given number is a two-digit number or not.
*/
public class Q6TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>10 && n<100){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
