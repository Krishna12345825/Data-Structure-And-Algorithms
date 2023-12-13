package Tap.Tai.Q2_IfElse;

import java.util.Scanner;
/*
Print the equivalent ASCII character of a given number.
*/
public class Q13EquivalentASCIICharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char asciiChar = (char)n;
        System.out.println(asciiChar);
    }
}
