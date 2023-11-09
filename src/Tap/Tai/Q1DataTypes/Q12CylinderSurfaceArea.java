package Tap.Tai.Q1DataTypes;

import java.util.Scanner;
/*
Write a program to calculate total surface area of a cylinder. Formula: 2 * pi* r*(r+h)
        NOTE: take pi = 3.142
  */
public class Q12CylinderSurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius  = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 2 * 3.142 * radius * (radius + height);
        System.out.printf("%.4f\n", area);
    }
}
