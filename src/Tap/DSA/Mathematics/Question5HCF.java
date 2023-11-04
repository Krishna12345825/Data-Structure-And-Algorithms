package Tap.DSA.Mathematics;

import java.util.Scanner;

public class Question5HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int hcf;
        for (hcf = first < second ? first : second; hcf > 0; hcf--)
            if (first % hcf == 0 && second % hcf == 0)
                break;
        System.out.println("HCF " + hcf);
    }
}
