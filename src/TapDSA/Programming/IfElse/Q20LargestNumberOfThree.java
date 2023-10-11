package TapDSA.Programming.IfElse;

import java.util.Scanner;
/*
Find the largest number among three integers.
*/
public class Q20LargestNumberOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        int largestNumber = Math.max(n, Math.max(m, l));
        System.out.println(largestNumber);
    }
}
