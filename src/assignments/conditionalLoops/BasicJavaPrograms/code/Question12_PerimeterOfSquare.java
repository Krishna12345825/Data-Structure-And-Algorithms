package assignments.conditionalLoops.BasicJavaPrograms.code;
//12. Perimeter Of Square

import java.util.Scanner;

public class Question12_PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side Of Square");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Square " + perimeter);

    }
}
