package assignments.conditionalLoops.BasicJavaPrograms;
//4. Area Of Isosceles Triangle

import java.util.Scanner;

public class Question4AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base, Height Of Isosceles Triangle");
        float height = scanner.nextFloat();
        float base = scanner.nextFloat();
        double area = (0.5 * base * height);
        System.out.println("Area Of Isosceles Triangle " + area);
    }
}
