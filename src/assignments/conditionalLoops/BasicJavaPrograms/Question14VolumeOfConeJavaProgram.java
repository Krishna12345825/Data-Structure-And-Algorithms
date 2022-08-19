package assignments.conditionalLoops.BasicJavaPrograms;
// 14. Volume Of Cone Java Program

import java.util.Scanner;

public class Question14VolumeOfConeJavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radios, Height of   Cone Java");
        double height = scanner.nextDouble();
        double radios = scanner.nextDouble();
        double volume = (0.34 * 3.14 * radios * radios * height);
        System.out.println(" Volume Of Cone " + volume);
    }
}
