package TapDSA.Pattern;

import java.util.Scanner;

public class Q10GenerateEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
//        int n  = scanner.nextInt();
        int n=5;
        pattern10(n);

    }

    public static void pattern10(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
