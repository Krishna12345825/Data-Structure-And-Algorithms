package assignments.functions.code;

import java.util.Scanner;

//1. [Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user.]
// (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)
public class Q1MaxMinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstNumber");
        int first = scanner.nextInt();

        System.out.println("Enter Second Number");
        int second = scanner.nextInt();

        System.out.println("Enter third Number");
        int third = scanner.nextInt();

        int ans1 = maximumNumber(first, second, third);
        int ans2 = miniMumNumber(first, second, third);

        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
                first, second, third, ans1);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n",
                first, second, third, ans2);
    }

    public static int maximumNumber(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    public static int miniMumNumber(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}
