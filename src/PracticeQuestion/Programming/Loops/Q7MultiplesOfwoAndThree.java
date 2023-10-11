package PracticeQuestion.Programming.Loops;

import java.util.Scanner;

/*
Write a program to print all the numbers which are multiples of either 2 or 3 till N.
*/


public class Q7MultiplesOfwoAndThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=2; i<=n; i++){
            if(i%2==0 || i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
