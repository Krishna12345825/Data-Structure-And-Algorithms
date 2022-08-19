package assignments.conditionalLoops.BasicJavaPrograms;
//15. Volume Of Prism

import java.util.Scanner;

public class Question15_VolumeOfPrism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base, Height of Prism");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = (base * height);
        System.out.println(" Volume Of Prism " + volume);

    }
}
