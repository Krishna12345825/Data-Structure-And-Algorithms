package Tap.Tai.Q2IfElse;

import java.util.Scanner;

/*
Check whether the given number is a multiple of both 5 and 3.
 */
public class Q4MultipleOf5And3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
