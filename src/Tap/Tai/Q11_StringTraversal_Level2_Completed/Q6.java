package Tap.Tai.Q11_StringTraversal_Level2_Completed;

import java.util.Scanner;

/*

Remove Lowercase Characters

input:
        PpRrOoGgRrAaMmMmIiNnGg

        output:

        PROGRAMMING
*/


public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = removeLowercaseCharacters(s);
        System.out.println(result);
    }

    static String removeLowercaseCharacters(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                t = t + ch;
            }
        }
        return t;
    }
}
