package assignments.patterns;

/*1.    *****
 *****
 *****
 *****
 *****    */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Row ");
        int row =scanner.nextInt();
        System.out.println("Enter Column");
        int column=scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (j >= 1 && j <= row) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
