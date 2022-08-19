package assignments.conditionalLoops.BasicJavaPrograms.code;

import java.util.Scanner;

//8. Perimeter Of Circle
public class Question8PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        double radius = scanner.nextDouble();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter Of Circle " + perimeter);
    }
}
