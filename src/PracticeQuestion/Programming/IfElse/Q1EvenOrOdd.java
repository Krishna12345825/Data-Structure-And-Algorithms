package PracticeQuestion.Programming.IfElse;

import java.util.Scanner;

/*Check if a given number is even number or odd number*/
public class Q1EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
