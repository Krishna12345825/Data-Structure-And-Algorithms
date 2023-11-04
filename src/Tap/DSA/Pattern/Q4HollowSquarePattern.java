package Tap.DSA.Pattern;

import java.util.Scanner;

public class Q4HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        pattern4(n);
    }

    public static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == 1 || i == n || j==1 || j==n){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
