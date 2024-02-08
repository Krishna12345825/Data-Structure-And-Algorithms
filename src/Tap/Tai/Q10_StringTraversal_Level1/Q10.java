package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;
/*

Number Printer
input1:
Hello123

output1:
123

input2:
Hello World!
output2
No number found.

*/


public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        numberPrint(s);
    }

    static void numberPrint(String s){
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9'){
                System.out.print(ch + " ");
                check = true;
            }
        }
        if (!check){
            System.out.print("No Number found.");
        }
    }
}
