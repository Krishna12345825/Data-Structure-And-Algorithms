package Tap.DSA.Pattern;

import java.util.Scanner;

public class Q2NumberSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        pattern2(n);
    }
    public static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
