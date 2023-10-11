package PracticeQuestion.Programming.Loops;

import java.util.Scanner;

/*
Write a program to count factors of a given number.
*/
public class Q13CountFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
