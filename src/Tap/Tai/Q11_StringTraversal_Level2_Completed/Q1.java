package Tap.Tai.Q11_StringTraversal_Level2_Completed;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String  result =  swappCase(s);
        System.out.println(result);
    }

    static String swappCase(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')){
                t = t +  (char)(ch -32);
            } else if (ch >= 'A' && ch <= 'Z') {
                t = t + (char)(ch + 32);
            }else {
                t = t + ch;
            }
        }
        return t;
    }
}
