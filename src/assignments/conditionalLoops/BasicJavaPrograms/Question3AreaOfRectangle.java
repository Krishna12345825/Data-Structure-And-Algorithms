package assignments.conditionalLoops.BasicJavaPrograms;

import java.util.Scanner;

//3. Area Of Rectangle Program
public class Question3AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length, Breadth Of Rectangle");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double area = length * breadth;
        System.out.println("Area Of Rectangle " + area);
    }
}
