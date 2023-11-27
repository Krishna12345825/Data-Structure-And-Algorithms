package Tap.RunningClass.Strings.Day1_String_ReverseString_Palindrome;

import java.util.Scanner;

/*Given a String , Write a program to reverse the String */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = reverse1(input);
        System.out.println(ans);
    }

    static String reverse(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i) + t;
        }
        return t;
    }

    static String reverse1(String s){
        String t = "";
        for (int i = s.length()-1; i >=0; i--) {
            t =  t + s.charAt(i);
        }
        return t;
    }
}
