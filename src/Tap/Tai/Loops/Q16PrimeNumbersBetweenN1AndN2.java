package Tap.Tai.Loops;

import java.util.Scanner;

/*
Print all prime numbers between n1 and n2.
*/


public class Q16PrimeNumbersBetweenN1AndN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        printPrimeNumbers(n1, n2);
    }

    public static void printPrimeNumbers(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
