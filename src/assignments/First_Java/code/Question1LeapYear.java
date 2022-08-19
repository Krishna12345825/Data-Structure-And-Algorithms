package assignments.First_Java.code;

import java.util.Scanner;

public class Question1LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int years = scanner.nextInt();
        if ((((years % 4 == 0) && (years % 100!= 0))) || (years % 400 == 0))
            System.out.println("Leap Years");
        else
            System.out.println("Not a leap year");


    }
}
