package Tap.Tai.Q1DataTypes;

import java.util.Scanner;
/*
Write a program to convert celsius to fahrenheit. Formula : fahrenheit= (celsius*9/5)+32
*/
public class Q10CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f\n", fahrenheit);
    }
}
