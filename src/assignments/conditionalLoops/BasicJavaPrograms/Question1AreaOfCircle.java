package assignments.conditionalLoops.BasicJavaPrograms;

import java.util.Scanner;

//1. Area Of Circle Java Program
public class Question1AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Redis Of a Circle");
        float reds = scanner.nextFloat();
        float area = (float) (3.14 * reds * reds);
        System.out.println("Area Of Circle " + area);

    }
}
