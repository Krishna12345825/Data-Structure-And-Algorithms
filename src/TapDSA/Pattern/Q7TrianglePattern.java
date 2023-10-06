package TapDSA.Pattern;

import java.util.Scanner;

public class Q7TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        pattern7(n);
    }

    public static void pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
