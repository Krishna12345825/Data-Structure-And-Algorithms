package Tap.Tai.Loops;

import java.util.Scanner;
/*
Print all prime numbers from 2 up to and including 'n'.
*/

public class Q15PrimeNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeNumbers(n);
    }

    public static void printPrimeNumbers(int n) {
        // Your code to print prime numbers goes here
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int nums){
        if(nums<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(nums); i++){
            if(nums % i == 0){
                return false;
            }
        }
        return true;
    }
}
