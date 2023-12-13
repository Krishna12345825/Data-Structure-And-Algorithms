package Tap.Tai.Q2_IfElse;

import java.util.Scanner;

/*
Check whether the given number is a multiple of 5, 3, and 7.
 */
public class Q5MultipleOf5And3And7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%3==0 && n%5==0 && n%7==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
