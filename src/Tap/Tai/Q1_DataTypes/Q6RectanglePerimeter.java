package Tap.Tai.Q1_DataTypes;

import java.util.Scanner;

// Write a program to find the perimeter of the rectangle. Formula: perimeter = 2 * (length + width)

public class Q6RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}
