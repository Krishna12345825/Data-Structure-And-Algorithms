package PracticeQuestion.Programming.IfElse;

import java.util.Scanner;

/*
Check if a given number is a three-digit number and also a multiple of 2, 5, and 10.
*/

public class Q9ThreeDigitNumberAndMultipleOf2And5And10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=100 && n<1000 && n%2==0 && n%5==0 && n%10==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
