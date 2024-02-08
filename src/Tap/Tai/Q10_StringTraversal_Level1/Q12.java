package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;
/*

Alphanumeric Character Count

input1:
        H33LL0

        output1
        6

*/


public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = countAlphaNumeric(s);
        System.out.println(result);
    }

    static int countAlphaNumeric(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                count++;
            }
        }
        return count;
    }
}
