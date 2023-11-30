package Tap.RunningClass.Strings.Day4_Swapp_Cases_RemoveSpaces;

import java.util.Scanner;

/* Convert UpperCase to LowerCase and LowerCase to UpperCase
* input:- KrishNANA
* output :- kRISHnana
* */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        String ans = swapCase(input);
        System.out.println(ans);
    }
    static String swapCase(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                t = t  + (char) (ch + 32);
            }else if (ch >= 'a' && ch <= 'z'){
                t = t +(char) (ch - 32);
            }else {
                t = t + ch;
            }
        }
        return t;
    }
}
