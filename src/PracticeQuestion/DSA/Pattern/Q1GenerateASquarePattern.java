package PracticeQuestion.DSA.Pattern;

import java.util.Scanner;
public class Q1GenerateASquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
       pattern1(n);
    }
    public static void pattern1(int n){
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
