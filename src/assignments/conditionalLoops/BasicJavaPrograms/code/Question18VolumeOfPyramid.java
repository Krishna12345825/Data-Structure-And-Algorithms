package assignments.conditionalLoops.BasicJavaPrograms.code;

import java.util.Scanner;

//18. Volume Of Pyramid
public class Question18VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base,Height Of pyramid ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = (0.34 * base * base * height);
        System.out.println(" Volume Of Pyramid " + volume);
    }
}
