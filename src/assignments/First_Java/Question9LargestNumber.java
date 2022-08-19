package assignments.First_Java;

import java.util.Scanner;

public class Question9LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int first= scanner.nextInt();
        int second=scanner.nextInt();
        if (first>second)
            System.out.println(first+" is a Greater Number");
        else
            System.out.println(second+" is a Greater number");
    }
}
