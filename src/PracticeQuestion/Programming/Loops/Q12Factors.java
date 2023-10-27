package PracticeQuestion.Programming.Loops;

import java.util.Scanner;

/*
Write a program to find factors of a given number. ok
*/
public class Q12Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
