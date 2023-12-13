package Tap.Tai.Q2_IfElse;

import java.util.Scanner;

/*
Determine whether the given number is a multiple of 5 or not.
*/
public class Q2MultipleOf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%5==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
