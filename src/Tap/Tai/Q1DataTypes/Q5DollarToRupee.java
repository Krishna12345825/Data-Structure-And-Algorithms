package Tap.Tai.Q1DataTypes;
// Write a program to convert Dollars to rupees. Consider 1 dollar = 82.73 inr.

import java.util.Scanner;

public class Q5DollarToRupee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        double dollars = scanner.nextDouble();
        double rupees = dollars * 82.73;
        System.out.printf("%.4f\n", rupees);
    }
}
