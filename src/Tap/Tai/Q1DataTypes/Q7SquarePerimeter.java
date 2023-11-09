package Tap.Tai.Q1DataTypes;

// Write a program to find the perimeter of the square. Formula: Perimeter = 4 * side

import java.util.Scanner;

public class Q7SquarePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side = scanner.nextInt();
        int perimeter = 4 * side;
        System.out.println(perimeter);
    }
}
