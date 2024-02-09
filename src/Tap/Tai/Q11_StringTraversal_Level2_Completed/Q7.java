package Tap.Tai.Q11_StringTraversal_Level2_Completed;

import java.util.Scanner;

/*

Remove Vowel

input1:
        coding

        output:

        cdng

*/

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = removeVowel(s);
        System.out.println(result);
    }

    static String removeVowel(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                    || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                t = t + ch;
            }
        }
        return t;
    }
}
