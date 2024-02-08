package Tap.Tai.Q10_StringTraversal_Level1_COmpleted;
/*

Odd Index Character Printer
input :
Testing
output:
e t n

*/

import java.util.Scanner;

public class Q5 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        oddIndexing(s);
    }

    static void oddIndexing(String s){
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0){
                System.out.println(s.charAt(i));
            }
        }
    }
}
