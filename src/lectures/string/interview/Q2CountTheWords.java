package lectures.string.interview;

import java.util.Scanner;

//2) Write a Java program to count the number of words in a string?

public class Q2CountTheWords {
    public static void main(String[] args) {
        System.out.println("Enter the string");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.trim().split(" ");

        System.out.println("Number of words in the string = " + words.length);
    }
}
