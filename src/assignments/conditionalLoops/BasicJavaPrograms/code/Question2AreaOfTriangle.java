package assignments.conditionalLoops.BasicJavaPrograms.code;

import java.util.Scanner;

//2. Area Of Triangle
public class Question2AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base, Height Of Triangle");
        float base = scanner.nextFloat();
        float height = scanner.nextFloat();
        float area = (float) (0.5 * base * height);
        System.out.println("Area Of Triangle " + area);
    }
}
