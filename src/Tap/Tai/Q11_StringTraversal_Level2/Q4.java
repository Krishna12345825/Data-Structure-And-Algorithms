package Tap.Tai.Q11_StringTraversal_Level2;

import java.util.Scanner;

/*

Insert Asterisks Before Vowel

input:
programing
        output:
        pr*ogr*am*ing

*/


public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = insertAsterisksVowel(s);
        System.out.println(result);
    }
    static String insertAsterisksVowel(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
              || (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                t = t + "*" + ch;
            }else {
                t = t + ch;
            }
        }
        return t;
    }
}
