package assignments.conditionalLoops.BasicJavaPrograms.code;
// 16. Volume Of Cylinder

import java.util.Scanner;

public class Question16_VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius, Height of Cylinder");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = (3.14 * radius * radius * height);

        System.out.println("Volume Of Cylinder " + volume);

    }
}
