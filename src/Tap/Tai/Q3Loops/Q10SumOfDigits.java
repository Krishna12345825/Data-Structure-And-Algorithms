package Tap.Tai.Q3Loops;

import java.util.Scanner;

/*
Find the sum of all digits in a positive integer.
*/

public class Q10SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = findSumOfDigits(num);
        System.out.println(sum);
    }

    public static int findSumOfDigits(int num) {
        int sum = 0;
        int digit;
        while(num>0){
            digit = num % 10;
            sum = sum +digit;
            num = num / 10;
        }
        return sum;
    }
}
