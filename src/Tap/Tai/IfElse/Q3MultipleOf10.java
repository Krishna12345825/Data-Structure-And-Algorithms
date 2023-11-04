package Tap.Tai.IfElse;

import java.util.Scanner;

/*
Determine whether the given number is a multiple of 10 or not.
 */
public class Q3MultipleOf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%10==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
