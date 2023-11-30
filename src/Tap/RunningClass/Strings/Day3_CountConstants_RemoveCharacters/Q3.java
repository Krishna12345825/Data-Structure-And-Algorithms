package Tap.RunningClass.Strings.Day3_CountConstants_RemoveCharacters;

// Remove Special charector

import java.util.Scanner;


//input:-  Hello&5WORLD

public class Q3 {
    public static void main(String[] args) {
       Scanner scanner =  new Scanner(System.in);
       String s = scanner.nextLine();
       String ans = removeSpecial(s);
        System.out.println(ans);
    }

    static String removeSpecial(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                t = t + ch;
            }
        }
        return t;
    }


}
