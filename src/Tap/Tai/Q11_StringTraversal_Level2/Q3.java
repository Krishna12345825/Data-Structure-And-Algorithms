package Tap.Tai.Q11_StringTraversal_Level2;

/*

UpperCase ASCII check

input1:
100
output:
yes

*/


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        lowerCaseAsciiCheck(n);
    }

    static void lowerCaseAsciiCheck(int n){
        if (n >= 97 && n<= 122){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
