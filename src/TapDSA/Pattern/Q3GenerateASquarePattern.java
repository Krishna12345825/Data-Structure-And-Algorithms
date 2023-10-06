package TapDSA.Pattern;

import java.util.Scanner;

public class Q3GenerateASquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= scanner.nextInt();
        pattern3(n);
    }

    public static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
