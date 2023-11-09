package Tap.Tai.Q2IfElse;

import java.util.Scanner;

/*
Check whether the given number is a three-digit number or not.
*/
public class Q7ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>100 && n<1000){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
