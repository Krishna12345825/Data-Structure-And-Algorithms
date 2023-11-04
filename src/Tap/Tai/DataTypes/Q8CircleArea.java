package Tap.Tai.DataTypes;

import java.util.Scanner;

/*
Write a program to find the area of the circle. Formula: area = pi*r*r. Consider pi = 3.142
        NOTE: 4 decimal points has to printed.
*/

public class Q8CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double area = 3.142 * radius * radius;
        System.out.printf("%.4f\n", area);
    }
}
