package Tap.Tai.Q2_IfElse;

import java.util.Scanner;

/*
Check if a given number is greater than 0, if yes then print 'Positive'.
If the given number is lesser than 0, then print 'Negative'. If the given number is exactly equal to 0, then print 'Zero'.
*/
public class Q17PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0){
            System.out.println("Zero");
        }else if(n>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
