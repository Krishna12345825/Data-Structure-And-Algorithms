package assignments.conditionalLoops.BasicJavaPrograms.code;

import java.util.Scanner;

// 20. Total Surface Area Of Cube
public class Question20TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of cube ");
        double side = scanner.nextDouble();
        double area = 6 * side * side;
        System.out.println(" Total Surface Area Of Cube " + area);
    }
}
