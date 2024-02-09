package Tap.Tai.Q11_StringTraversal_Level2_Completed;
/*

Remove spaces from a String

input:
     Hello,    worlds!
output:
Hello, worlds!

*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = removeSpaceFromString(s);
        System.out.println(result);
    }

    static String removeSpaceFromString(String s){
        int startingIndex = 0;
        int indedingIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                startingIndex = i;
                break;
            }
        }

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' '){
                indedingIndex = i;
                break;
            }
        }

        String t = "";
        for (int i = startingIndex; i <= indedingIndex ; i++) {
            if (s.charAt(i)== ' ' && s.charAt(i+1) != ' ' || s.charAt(i) != ' '){
                t = t + s.charAt(i);
            }
        }
        return t;
    }
}
