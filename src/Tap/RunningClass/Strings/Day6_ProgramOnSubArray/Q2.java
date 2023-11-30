package Tap.RunningClass.Strings.Day6_ProgramOnSubArray;

import java.util.Scanner;


/*
* print Palindrome SubArray
* */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printSubString(input);
    }
    static void printSubString(String s){
        for (int size = 1; size <= s.length(); size++) {
            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < i+ size; j++) {
                    t = t + s.charAt(j);
                }
                if (palindrome(t)){
                    System.out.println(t);
                }
            }
        }
    }

    static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
           if (s.charAt(i) == s.charAt(j)){
               i++;
               j--;
           }else {
               return false;
           }
        }
        return true;
    }


}
