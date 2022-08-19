package assignments.conditionalLoops.BasicJavaPrograms;

import java.util.Scanner;

//10. Perimeter Of Parallelogram
public class Question10_PerimeterOf_Parallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base,Side of Parallelogram");
        double base = scanner.nextDouble();
        double side = scanner.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("Perimeter Of Parallelogram " + perimeter);
    }
}
