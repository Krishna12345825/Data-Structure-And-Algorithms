package TapDSA.Pattern;

import java.util.Scanner;

public class Q9GenerateMirroredTriangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        pattern9(n);
    }
    public static void pattern9(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k<=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
