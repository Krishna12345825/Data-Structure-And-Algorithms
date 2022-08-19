package assignments.conditionalLoops.BasicJavaPrograms.code;
//7. Area Of Equilateral Triangle

import java.util.Scanner;

public class Question7AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side Of Equilateral ");
        double side = scanner.nextDouble();
        double area = (0.434) * side * side;
        System.out.println(" Area Of Equilateral Triangle " + area);
    }
}
