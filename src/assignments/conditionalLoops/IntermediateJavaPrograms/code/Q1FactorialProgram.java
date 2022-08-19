package assignments.conditionalLoops.IntermediateJavaPrograms.code;

import java.util.Scanner;
// 1. Factorial Program In Java
public class Q1FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
