package Tap.RunningClass.Strings.Day7_ProgramOnSubArray2;

import java.util.Scanner;

/*
* check given two Strings are equal or not
* */

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input1 = scanner.nextLine();
        System.out.println(check(input, input1));
    }

    static boolean check(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int i = 0;
        while (i < s1.length()){
            if (s1.charAt(i) == s2.charAt(i)){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }
}
