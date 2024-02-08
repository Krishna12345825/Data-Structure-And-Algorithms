package Tap.Tai.Q10_StringTraversal_Level1;
/*

Character Printer

input1:
Hello World!

output1:
h e l l o w o r l d

input2:
12345
output2:
no valid characters found.

*/

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        characterPrinters(s);
    }

    static void characterPrinters(String s){
        Boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                System.out.print(ch+ " ");
                check = true;
            }
        }
        if (!check){
            System.out.print("No valid characters found.");
        }
    }
}
