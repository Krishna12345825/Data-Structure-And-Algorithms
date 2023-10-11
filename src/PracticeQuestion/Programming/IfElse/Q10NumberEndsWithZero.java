package PracticeQuestion.Programming.IfElse;

import java.util.Scanner;

/*
Check if a given number ends with zero or not.
*/
public class Q10NumberEndsWithZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%10==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
