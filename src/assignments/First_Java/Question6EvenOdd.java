package assignments.First_Java;

import java.util.Scanner;

public class Question6EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int first=scanner.nextInt();
        if (first%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
