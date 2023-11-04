package Tap.DSA.Pattern;

import java.util.Scanner;

public class Q5SquarePattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        pattern5(n);
    }
    public static void pattern5(int n){
        for ( int i = 1; i <=n; i++) {
            for ( int j = 1; j<=n ; j++) {
                if (i*j<10){
                    System.out.print("0");
                }
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
