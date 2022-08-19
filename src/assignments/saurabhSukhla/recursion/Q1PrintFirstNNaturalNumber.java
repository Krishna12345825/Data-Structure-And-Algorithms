package assignments.saurabhSukhla.recursion;

// 1. Write a recursive function to print first N natural numbers

import java.util.Arrays;

public class Q1PrintFirstNNaturalNumber {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(" " + n);
    }
}
