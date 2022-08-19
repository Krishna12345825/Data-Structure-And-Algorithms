package assignments.conditionalLoops.BasicJavaPrograms.code;
//5. Area Of Parallelogram

import java.util.Scanner;

public class Question5AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base,Height Of Parallelogram");
        double base = scanner.nextFloat();
        double height = scanner.nextFloat();
        double are = base * height;
        System.out.println(" Area Of Parallelogram " + are);
    }
}
