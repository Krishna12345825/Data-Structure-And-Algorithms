package Tap.Tai.IfElse;

import java.util.Scanner;
/*
Print the ASCII value of a character.
*/
public class Q14ASCIIValueOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        int asciiValue = (int)c;
        System.out.println(asciiValue);
    }
}
