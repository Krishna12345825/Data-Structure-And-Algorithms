package lectures.methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = scanner.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);


        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //Q2. check Armstrong number or not
    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = rem * rem * rem;
        }
        return sum == original;
    }


    // Q1. check prime number or not
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
