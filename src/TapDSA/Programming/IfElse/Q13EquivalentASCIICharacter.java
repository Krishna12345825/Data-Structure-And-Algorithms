package TapDSA.Programming.IfElse;

import java.util.Scanner;
/*
Print the equivalent ASCII character of a given number.
*/
public interface Q13EquivalentASCIICharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char asciiChar = (char)n;
        System.out.println(asciiChar);
    }
}
