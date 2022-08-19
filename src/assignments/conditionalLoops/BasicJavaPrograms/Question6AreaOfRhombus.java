package assignments.conditionalLoops.BasicJavaPrograms;

import java.util.Scanner;

//6. Area Of Rhombus
public class Question6AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Diagonal1, Diagonal2 ");
        double diagonal1 = scanner.nextDouble();
        double diagonal2 = scanner.nextDouble();
        double area = (0.5 * diagonal1 * diagonal2);
        System.out.println(" Area Of Rhombus " + area);
    }
}
