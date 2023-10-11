package PracticeQuestion.Programming.DataTypes;

import java.util.Scanner;

/*
Print the circumference of the circle. The circumference should have four decimal places only.
*/

public class Q9CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double  circumference = 2 * 3.142 * radius;
        System.out.printf("%.4f\n", circumference);
    }
}
