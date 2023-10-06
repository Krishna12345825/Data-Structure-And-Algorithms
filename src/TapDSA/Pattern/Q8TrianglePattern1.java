package TapDSA.Pattern;

import java.util.Scanner;

public class Q8TrianglePattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        pattern8(n);
    }

    public static void pattern8(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
