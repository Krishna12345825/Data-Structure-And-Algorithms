package PracticeQuestion.DSA.Pattern;

import java.util.Scanner;

public class Q6NumberPattern3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =scanner.nextInt();
        pattern6(n);
    }

    public static void pattern6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j<=n+i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
