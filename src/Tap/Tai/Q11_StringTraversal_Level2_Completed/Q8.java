package Tap.Tai.Q11_StringTraversal_Level2_Completed;

import java.util.Scanner;
/*

Remove Numeric Characters

input:
 p09r0j43je0ct
        output:
 prjject

*/

public class Q8 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = removeNumericCharacters(s);
        System.out.println(result);
    }

    static String removeNumericCharacters(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                t = t + ch;
            }
        }
        return t;
    }
}
