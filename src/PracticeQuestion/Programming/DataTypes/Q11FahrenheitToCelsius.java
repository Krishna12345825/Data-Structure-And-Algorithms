package PracticeQuestion.Programming.DataTypes;

import java.util.Scanner;

/*
Write a program to convert fahrenheit to celsius. Formula : celsius = (fahrenheit-32)*5/9
*/
public class Q11FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.4f\n", celsius);
    }
}
