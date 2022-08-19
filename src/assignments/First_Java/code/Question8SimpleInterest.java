package assignments.First_Java.code;

import java.util.Scanner;

public class Question8SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principle,Time,Rate");
        float principle = scanner.nextFloat();
        int time = scanner.nextInt();
        float rate = scanner.nextFloat();
        float si = ((principle * time * rate) / 100);
        System.out.println("Simple Interest " + si);
    }
}
