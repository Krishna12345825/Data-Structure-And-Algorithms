package assignments.First_Java;

import java.util.Scanner;

public class Question2SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number");
        int second = scanner.nextInt();
        int sum = first + second;
        System.out.println("Sum of Two Number = " + sum);
    }
}
