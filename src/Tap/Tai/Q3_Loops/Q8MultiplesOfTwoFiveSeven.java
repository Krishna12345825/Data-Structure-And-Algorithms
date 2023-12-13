package Tap.Tai.Q3_Loops;

import java.util.Scanner;

/*
Write a program to print all the numbers which are multiples of either 2, 5 or 7 till N.
*/

public class Q8MultiplesOfTwoFiveSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n; i++){
            if(i%2==0 || i%5==0 || i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
