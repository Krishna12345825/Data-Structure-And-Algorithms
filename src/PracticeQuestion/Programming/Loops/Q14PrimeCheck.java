package PracticeQuestion.Programming.Loops;

import java.util.Scanner;

/*
Write a program to find whether the given number is a prime number or not.
*/

public class Q14PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrrimes = isPrime(n);
        if(isPrrimes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
