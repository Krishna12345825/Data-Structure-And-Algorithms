package assignments.conditionalLoops.BasicJavaPrograms;

import java.util.Scanner;

//13. Perimeter Of Rhombus
public class Question13PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the side of Rhombus");
        double side = scanner.nextDouble();
        double perimeter= 4*side;
        System.out.println(" Perimeter Of Rhombus "+perimeter);
    }
}
