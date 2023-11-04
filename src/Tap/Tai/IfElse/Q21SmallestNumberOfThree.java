package Tap.Tai.IfElse;
import java.util.Scanner;

/*
Find the smallest number among three integers.
*/
public class Q21SmallestNumberOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        int smallestNumber = Math.min(n, Math.min(m, l));
        System.out.println(smallestNumber);
    }
}
