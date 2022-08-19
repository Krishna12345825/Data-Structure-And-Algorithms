package assignments.conditionalLoops.BasicJavaPrograms;
// 17. Volume Of Sphere

import java.util.Scanner;

public class Question17VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius of Sphere ");
        double radius = scanner.nextDouble();
        double volume = 1.34 * 3.14 * radius * radius * radius;
        System.out.println(" Volume Of Sphere " + volume);
    }
}
