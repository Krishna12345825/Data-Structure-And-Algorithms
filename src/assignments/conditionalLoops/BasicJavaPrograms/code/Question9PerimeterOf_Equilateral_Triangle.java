package assignments.conditionalLoops.BasicJavaPrograms.code;
//9. Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class Question9PerimeterOf_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side Of Equilateral Triangle");
        double side = scanner.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle " + perimeter);
    }
}
