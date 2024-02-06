package Tap.Tai.Q10_StringTraversal_Level1;

import java.util.Scanner;
/*

Reverse String

input:
Krishna
output:
anhsirk

*/

public class Q7 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = reverseString(s);
        System.out.println(result);
    }

   /*
   static String reverseString(String s){
        String t = "";
        for (int i = 0; i<s.length(); i++){
            t =  s.charAt(i) + t;
        }
        return t;
    }
    */

    static String reverseString(String s){
        String t = "";
        for (int i = s.length()-1; i >=0; i--) {
            t = t + s.charAt(i);
        }
        return t;
    }
}
