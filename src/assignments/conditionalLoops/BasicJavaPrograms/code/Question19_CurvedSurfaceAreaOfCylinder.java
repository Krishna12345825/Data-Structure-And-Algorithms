package assignments.conditionalLoops.BasicJavaPrograms.code;

import java.util.Scanner;

//19. Curved Surface Area Of Cylinder
public class Question19_CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius, Height of cylinder");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 2 * 3.14 * radius * height;
        System.out.println(" Curved Surface Area Of Cylinder " + area);
    }
}
